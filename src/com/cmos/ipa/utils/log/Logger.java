package com.cmos.ipa.utils.log;

import com.cmos.ipa.utils.Global;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * <code>Logger实体类</code>
 * @author Hardy
 * @date 2016/4/27 18:40
 * @version 1.0
 */
public class Logger implements Serializable, LogLevel {
	
	/**
     * Comment for <code>serialVersionUID</code>.
     */
	private static final long serialVersionUID = 1654140125572868207L;

    /**
     * the maximum size of each log file.
     */
	final static long MAX_FILE_SIZE = 1024 * 1000 * Global.LOG_MAXSIZE; //2048000;
    /**
     * <code>一天的毫秒数</code>
     */
    final static long DAY_MS = 24 * 60 * 60 * 1000L;
    /**
     * Comment for <code>DATE_FORMATTER</code>.
     */
    final static SimpleDateFormat MS_FORMATTER =  new SimpleDateFormat ("MM-dd HH:mm:ss.SSS");
    /**
     * Comment for <code>FILE_NAME_FORMATTER</code>.
     */
    final static SimpleDateFormat HH_FORMATTER =  new SimpleDateFormat ("HHmmss");

    final static SimpleDateFormat YY_FORMATTER = new SimpleDateFormat("yyyyMMdd");
    
      

    private boolean isRecodeWhere = false;

    /**
     * the log file level.
     */
    private int level = INFO;
    private boolean isTraceEnabled = false;
    private boolean isDebugEnabled = false;
    private boolean isInfoEnabled = true;
    private boolean isWarnEnabled = true;
    private boolean isErrorEnabled = true;
    private boolean isFatalEnabled = true;
    
    /**
     * the log file base dir.
     */
    private String logDir;
    /**
     * the log file work dir.
     */
    private String workDir;
    /**
     * the log file name.
     */
    private String logName ="Logger";

    private File file;
    private long switchTime = System.currentTimeMillis() / DAY_MS * DAY_MS;
    private PrintWriter writer;

    private BlockingDeque<StringBuffer> queue = new LinkedBlockingDeque<StringBuffer>();
    
    private Object writeMutex = new Serializable() {
        /**
         * Comment for <code>serialVersionUID</code>.
         */
        private static final long serialVersionUID = 1L;
    };

    private int mkTime = 0; 
    private int zipFact = 7;
    private int delFact = 60;


    /**
     * 一个Logger实例
     */
    static private Logger logger;

    /**
     * 取得Logger实例
     */
    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger("msg",Global.LOG_LEVEL);
        }
        return logger;
    }

    /**
     * Loger Constructor.
     * @param dir save log directory
     * @param name log file name
     * @param level	log level
     */
    private Logger(String dir, String name, int level) {
        logDir = dir;
        if (logDir == null) {
            logDir = System.getProperty("java.io.tmpdir");
            if (logDir == null) {
                logDir = System.getProperty("user.dir");
            }
        }
        logName = name;
        level = level % LOG_LEVEL_CODES.length;
        this.level = level;
        isTraceEnabled = level <= TRACE;
        isDebugEnabled = level <= DEBUG;
        isInfoEnabled = level <= INFO;
        isWarnEnabled = level <= WARN;
        isErrorEnabled = level <= ERROR;
        isFatalEnabled = level <= FATAL;
        setWriter();

    }


    public Logger(String name, int level) {
        this("log/", name, level);
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "Logger[" + logDir + "/" + logName + "@" + level + "]";
    }



    public boolean isLoggable(int level) {
        return this.level <= level;
    }
    /**
     * Gets the log level.
     * @return Returns the log level.
     */
    public int getLogLevel() {
        return this.level;
    }
    /**
     * Sets the log level.
     * @param level log level that controls if this message will be logged.
     */
    public void setLogLevel(int level) {
        if (writer == null) {
            return;
        }
        level = level % LOG_LEVEL_CODES.length;
        synchronized (writeMutex) {
            writer.println("###############################################################");
            writer.println("#\t CHANGE " + LOG_LEVEL_CODES[this.level] + " TO " + LOG_LEVEL_CODES[level]);
            writer.println("###############################################################");
            writer.flush();
        }
        this.level = level;
        isTraceEnabled = level <= TRACE;
        isDebugEnabled = level <= DEBUG;
        isInfoEnabled = level <= INFO;
        isWarnEnabled = level <= WARN;
        isErrorEnabled = level <= ERROR;
        isFatalEnabled = level <= FATAL;
    }
    /**
     * Gets the log name.
     * @return Returns the log name.
     */
    public String getLogName() {
        return logName;
    }
    /**
     * Gets the log dir.
     * @return Returns the log dir.
     */
    public String getLogDir() {
        return logDir;
    }


    public boolean isTraceEnabled() {
        return isTraceEnabled;
    }
    public void log_trace(Object mess) {
        if (isTraceEnabled) { log(TRACE, mess); }
    }
    public void log_trace(Object mess, Throwable thr) {
        if (isTraceEnabled) { printStackTrace(TRACE, mess, thr); }
    }

    public boolean isDebugEnabled() {
        return isDebugEnabled;
    }
    public void log_debug(Object mess) {
        if (isDebugEnabled) { log(DEBUG, mess); }
    }
    public void log_debug(Object mess, Throwable thr) {
        if (isDebugEnabled) { printStackTrace(DEBUG, mess, thr); }
    }

    public boolean isInfoEnabled() {
        return isInfoEnabled;
    }
    public void log_info(Object mess) {
        if (isInfoEnabled) { log(INFO, mess); }
    }
    public void log_info(Object mess, Throwable thr) {
        if (isInfoEnabled) { printStackTrace(INFO, mess, thr); }
    }

    public boolean isWarnEnabled() {
        return isWarnEnabled;
    }
    public void log_warn(Object mess) {
        if (isWarnEnabled) { log(WARN, mess); }
    }
    public void log_warn(Object mess, Throwable thr) {
        if (isWarnEnabled) { printStackTrace(WARN, mess, thr); }
    }

    public boolean isErrorEnabled() {
        return isErrorEnabled;
    }
    public void log_error(Object mess) {
        if (isErrorEnabled) { log(ERROR, mess); }
    }
    public void log_error(Object mess, Throwable thr) {
        if (isErrorEnabled) { printStackTrace(ERROR, mess, thr); }
    }

    public boolean isFatalEnabled() {
        return isFatalEnabled;
    }
    public void log_fatal(Object mess) {
        if (isFatalEnabled) { log(FATAL, mess); }
    }
    public void log_fatal(Object mess, Throwable thr) {
        if (isFatalEnabled) { printStackTrace(FATAL, mess, thr); }
    }


    /**
     * Logs this message.
     * @param level	log level that controls if this message will be logged.
     * When this log level is equal or greater than the definedlog level, this message is logged.
     * @param message 	text message to be logged.
     */
    public void log(int level, Object message) {
        if (!init(level)) {
            return;
        }
        String date = MS_FORMATTER.format(Calendar.getInstance().getTime());
        StringBuffer sb = getStringBuffer();
        sb.append(date);
        sb.append(LOG_LEVEL_CODES[level]);
        sb.append(";");
        sb.append(Thread.currentThread().getName());
        if (isRecodeWhere) {
            sb.append("\n   Where:");
            sb.append(getWhere());
        }
        synchronized (writeMutex) {
            //writer.println(sb.toString());
            writer.print(sb.toString()+"\t");
            writer.println(message);
            writer.flush();
        }
        returnStringBuffer(sb);
    }

    /**
     * Logs the stack trace of an exception.
     * @param level		log level that controls if this message will be logged.
     * When this log level is equal or greater than the defined log level, this message is logged.
     * @param title 		text title to be put into the log.
     * @param throwable 	exception to be logged.
     */
    public void printStackTrace(int level, Object title, Throwable throwable) {
        if (!init(level)) {
            return;
        }
        String date = MS_FORMATTER.format(Calendar.getInstance().getTime());
        StringBuffer sb = getStringBuffer();
        sb.append(date);
        sb.append(LOG_LEVEL_CODES[level]);
        sb.append(";");
        sb.append(Thread.currentThread().getName());
        sb.append("\t");
        sb.append(title);
        if (isRecodeWhere) {
            sb.append("\n   Where:");
            sb.append(getWhere());
        }
        synchronized (writeMutex) {
            writer.println(sb.toString());
            throwable.printStackTrace(writer);
            writer.flush();
        }
        returnStringBuffer(sb);
    }


    public void location(int level, Object message) {
        if (!init(level)) {
            return;
        }
        StringBuffer sbloc = getStringBuffer();
        String where = null;

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream pw = new PrintStream(os);
        System.setErr(pw);
        Thread.dumpStack();
        System.setErr(System.err);
        pw.flush();
        StringTokenizer st = new StringTokenizer(os.toString(), "\n");
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if (s.indexOf("com.cmos.ipa.utils.log.Logger.") == -1 &&
                    s.indexOf("java.lang.Thread") == -1 &&
                    s.indexOf("at ") > -1)
            {
                if (null == where) {
                    where = s.trim();
                }
                sbloc.append(s);
                if (st.hasMoreTokens()) {
                    sbloc.append("\n");
                }
            }
        }
        pw.close();

        String date = MS_FORMATTER.format(Calendar.getInstance().getTime());
        StringBuffer sb = getStringBuffer();
        sb.append(">> ");
        sb.append(date);
        sb.append("; Thr:");
        sb.append(Thread.currentThread().getName());
        sb.append("; LogLvl:");
        sb.append(LOG_LEVEL_CODES[level]);
        if (isRecodeWhere) {
            sb.append("\n   Where:");
            sb.append(where);
        }
        synchronized (writeMutex) {
            writer.println(sb.toString());
            writer.println(message);
            writer.println(sbloc.toString());
            writer.flush();
        }
        returnStringBuffer(sb);
        returnStringBuffer(sbloc);
    }

    /**
     * Writes the configurations of this running program.
     */
    public void writeConfigurations() {
        if (writer == null) {
            return;
        }
        synchronized (writeMutex) {
            writer.println("###############################################################");
            writer.println("#");
            writer.println("#\t LOG_LEVEL = "+ LOG_LEVEL_CODES[level]);
            writer.println("#");
            writer.println("###############################################################");
            writer.flush();
        }
    }

    /**
     * Turn on Diagnosis facility.
     */
    public void turnOn() {
        if (writer == null) {
            return;
        }
        synchronized (writeMutex) {
            writer.println("###############################################################");
            writer.println("#");
            writer.println("#\t  Server Turn On    " + MS_FORMATTER.format(Calendar.getInstance().getTime()));
            writer.println("#");
            writer.println("###############################################################");
            writer.println("");
            writer.flush();
        }
    }

    /**
     * Shuts down Diagnosis facility.
     */
    public void shutDown() {
        if (writer == null) {
            return;
        }
        synchronized (writeMutex) {
            writer.flush();
            writer.println("###############################################################");
            writer.println("#");
            writer.println("#\t  Server Shut Down    " + MS_FORMATTER.format(Calendar.getInstance().getTime()));
            writer.println("#");
            writer.println("###############################################################");
            writer.println("");
            writer.close();
            writer = null;
        }
    }



    private boolean init(int level) {
        if (level < this.level || null == writer) {
            return false;
        }
        if (System.currentTimeMillis() >= switchTime || file.length() > MAX_FILE_SIZE) {
            synchronized (writeMutex) {
                if (System.currentTimeMillis() >= switchTime || file.length() > MAX_FILE_SIZE) {
                    setWriter();
                }
            }
        }
        return true;
    }

    /**
     * Sets writer to be used to write logs.
     */
    private void setWriter() {
        if (writer != null) {
            writer.println("###############################################################");
            writer.println("\t End Of the Log File:" + logName + ".log");
            writer.println("###############################################################");
            writer.flush();
            writer.close();
        }
        // create log dir and file.
        long current = System.currentTimeMillis();
        if(current >= switchTime) {
            final long dayms = switchTime;
            int day = Integer.parseInt(YY_FORMATTER.format(new Date(switchTime)));
            switchTime = (current / DAY_MS + 1) * DAY_MS;

            workDir = logDir + File.separator + day;
            new File(workDir).mkdirs();
            boolean endo;
            synchronized (Logger.class) {
                if (day > mkTime) {
                    mkTime = day;
                    endo = true;
                } else {
                    endo = false;
                }
            }
            if (endo) {
                new Thread("Logger.schedule") {
                    public void run() {
                        schedule(
                                Integer.parseInt(YY_FORMATTER.format(
                                        new Date(dayms - delFact * DAY_MS))),
                                Integer.parseInt(YY_FORMATTER.format(
                                        new Date(dayms - zipFact * DAY_MS))));
                    }
                }.start();
            }
        } else {
            String nfile = workDir + File.separator + logName +
                    HH_FORMATTER.format(new Date(current))+".log";
            if (!file.renameTo(new File(nfile))) {
                try {
                    FileOutputStream os = new FileOutputStream(nfile, true);
                    FileInputStream is = new FileInputStream(file);
                    byte[] bs = new byte[1024];
                    int len = 0;
                    while ((len = is.read(bs)) > 0) {
                        if (len == 1024) {
                            os.write(bs);
                        } else {
                            os.write(bs, 0, len);
                            break;
                        }
                    }
                    os.close();
                    is.close();
                    FileWriter w = new FileWriter(file, false);
                    w.flush();
                    w.close();
                } catch (IOException ex) {
                    writer.println("###############################################################");
                    writer.println("RENAME ERROR");
                    ex.printStackTrace(writer);
                    writer.println("###############################################################");
                }
            }
        }
        String logFile = workDir + File.separator + logName +".log";
        // create a file writer to write to the log file
        try {
            writer = new PrintWriter(new FileWriter(logFile, true));
            file = new File(logFile);
        } catch (IOException ex) {
            System.err.println("Fatal Error [" +
                    ex.toString() + "]!" +
                    "Diagnosis cannot write to the log file ["
                    + logFile + "].");
            System.err.println("System.out is used.");
            writer = new PrintWriter(System.out);
        }
    }
    /**
     * Gets the latest method of the thread stack.
     */
    private String getWhere() {
        String where = null;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream pw = new PrintStream(os);
        System.setErr(pw);
        Thread.dumpStack();
        System.setErr(System.err);
        pw.flush();
        String text = os.toString();
        StringTokenizer st = new StringTokenizer(text, "\n");
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if (s.indexOf("com.jbns.MesEngine.Logger.") == -1 &&
                    s.indexOf("java.lang.Thread") == -1 &&
                    s.indexOf("at ") > -1) {
                where = s.trim();
                break;
            }
        }
        pw.close();

        return where;
    }

    private StringBuffer getStringBuffer() {
        StringBuffer sb = queue.pollFirst();
        return sb == null ? new StringBuffer(120) : sb;
    }
    private void returnStringBuffer(StringBuffer sb) {
        sb.setLength(0);
        queue.push(sb);
    }

    private File[] search(File dir, long from, long upto, boolean isCZ) {
        File[] fs = dir.listFiles();
        int ind = 0;
        for (int i = 0; i < fs.length; i++) {
            if (!isCZ && !fs[i].isDirectory()) {
                continue;
            }
            String name = fs[i].getName();
            if (name.toLowerCase().endsWith(".zip")) {
                name = name.substring(0, (name.length() - 4));
            }
            try {
                YY_FORMATTER.parse(name);
            } catch (ParseException ex) {
                continue;
            }
            long fDate;
            try {
                fDate = Long.parseLong(name);
            } catch (NumberFormatException ex) {
                continue;
            }
            if (from < fDate && fDate <= upto) {
                fs[ind++] = fs[i];
            }
        }
        File[] re = new File[ind];
        System.arraycopy(fs, 0, re, 0, ind);
        return re;
    }

    private void zipDir(File[] dirList, PrintStream out) throws IOException {
        for (int i = 0; i < dirList.length; i++) {
            out.println(MS_FORMATTER.format(Calendar.getInstance().getTime()) +
                    " ZIP    :" + dirList[i].getName());
            File zip = new File(dirList[i].getPath() + ".zip");
            FileOutputStream fos = new FileOutputStream(zip);
            ZipOutputStream zipout = new ZipOutputStream(fos);
            zip(dirList[i], zipout, dirList[i].getName());
            zipout.finish();
            fos.close();
            del(dirList[i]);
        }
    }

    private void zip(File file, ZipOutputStream out, String base) throws IOException {
        if (file.isDirectory()) {
            out.putNextEntry(new ZipEntry(base + "/"));
            base = base + "/";
            File[] fs = file.listFiles();
            for (int i = 0; i < fs.length; i++) {
                zip(fs[i], out, base + fs[i].getName());
            }
        } else {
            out.putNextEntry(new ZipEntry(base));
            FileInputStream fin = new FileInputStream(file);
            byte[] bs = new byte[16384];
            int len;
            while ((len = fin.read(bs)) != -1) {
                out.write(bs, 0, len);
                if (len != 16384) {
                    break;
                }
            }
            fin.close();
        }
    }

    private void delDir(File[] dirList, PrintStream out) throws IOException {
        for (int i = 0; i < dirList.length; i++) {
            out.println(MS_FORMATTER.format(Calendar.getInstance().getTime()) +
                    " DELETE :" + dirList[i].getName());
            del(dirList[i]);
        }
    }

    private void del(File file) {
        if (file.isDirectory()) {
            File[] fs = file.listFiles();
            for (int i = 0; i < fs.length; i++) {
                del(fs[i]);
            }
        }
        file.delete();
    }

    private void schedule(int delFate, int zipFate) {
        File dir = new File(logDir);
        File lock = new File(dir + File.separator + "logger.lock");
        FileOutputStream raf;
        FileChannel fc;
        FileLock fl;
        try {
            lock.createNewFile();
            raf = new FileOutputStream(lock, true);
            fc = raf.getChannel();
            fl = fc.tryLock();
            if (fl != null && fl.isValid()) {
                PrintStream out = System.out;
                if (lock.canWrite()) {
                    out = new PrintStream(raf);
                }
                delDir(search(dir, 0, delFate, true), out);
                zipDir(search(dir, 0, zipFate, false), out);
                fl.release();
            }
            raf.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    	
}

