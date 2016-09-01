package com.cmos.ipa.utils.log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * <code>日志启用工具类</code>
 * @author Hardy
 * @date 2016/4/27 18:35
 * @version 1.0
 */
public class LoggerConn implements Serializable {

	private static final long serialVersionUID = -2365197474319437040L;


	/**
     * Comment for <code>DATE_FORMATTER</code>.
     */
    final SimpleDateFormat MS_FORMATTER =  new SimpleDateFormat ("MM-dd HH:mm:ss");
   

    /**
     * the log file name.
     */
    private String logName ="Logger";
    /**
     * the log file base dir.
     */
    private String logDir;
    
    private transient PrintWriter writer;

    
    private transient Object writeMutex = new Serializable() {
        /**
         * Comment for <code>serialVersionUID</code>.
         */
        private static final long serialVersionUID = 1L;
    };


    
    /**
	 * <code>Logger实例</code>
	 */
	static private LoggerConn logger;
	
	/**
	 * <code>取得Logger实例</code>
	 */
	public static LoggerConn getInstance() {
		if (logger == null) {
			logger = new LoggerConn("AgentConnError");
		}
		return logger;
	}
    

	private LoggerConn(String name) {
		this("log/", name);
    }

    /**
     * Logger Constructor.
     * @param dir save log directory
     * @param name log file name
     */
	private LoggerConn(String dir, String name) {
        logDir = dir;
        if (logDir == null) {
            logDir = System.getProperty("java.io.tmpdir");
            if (logDir == null) {
                logDir = System.getProperty("user.dir");
            }
        }
        logName = name;
        setWriter();  
    }
	
    /**
     * Sets writer to be used to write logs.
     */
    private void setWriter() {

    	String logFile = logDir + File.separator + logName +".log";

        try {
            writer = new PrintWriter(new FileWriter(logFile, true));
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
	 * Logs this message.
     * @param level	log level that controls if this message will be logged.
     * When this log level is equal or greater than the definedlog level, this message is logged.
     * @param message 	text message to be logged.
     */
    public void log(Object message) {
    	String date = MS_FORMATTER.format(Calendar.getInstance().getTime());
        synchronized (writeMutex) {
        	writer.print(date+"\t");
            writer.println(message);
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

}
   
    	


