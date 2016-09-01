package com.cmos.ipa.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <code>时间转换工具类</code>
 * @author Hardy
 * @date 2016/4/27 17:35
 * @version 1.0
 */
public class DateTimeUtil {
	
	public static final String DEFAULTFORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final String DEFAULTFORMAT_ONE = "1970-01 00:00";

    public static final String DEFAULTFORMAT_TWO = "yyyy/MM hh:mm";

    public  final SimpleDateFormat sdf = new SimpleDateFormat(DEFAULTFORMAT_TWO);
	
	public static String getCurDateTime() {
		return getCurDateTime(DEFAULTFORMAT);
	} 
    
	/**
	 * <code>获取当前时间</code>
	 * @param pattern
	 * @return
	 */
	public static String getCurDateTime(String pattern) {
		return formatCalendar(Calendar.getInstance(),pattern);
	}
	
	public static String formatCalendar(Calendar calendar){
		return formatCalendar(calendar,DEFAULTFORMAT);
	}
	
	public static String formatCalendar(Calendar calendar,String pattern){
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(calendar.getTime());
	}
	
	public static Date parseDate(String date) throws ParseException{
		if("".equals(StringUtil.checkBlankString(date))){
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return  sdf.parse(date);
	}
	
	public static Date parseDate(String date, String pattern) throws ParseException{
		if("".equals(StringUtil.checkBlankString(date))){
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return  sdf.parse(date);
	}
	
	public static String formatDate(Date date, String pattern){
		if(date==null){
			return "";
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return formatCalendar(calendar,pattern);
	}
	
	public static String formatDate(Date date){
		return formatDate(date,DEFAULTFORMAT);
	}
	
	public static Calendar parseString(String dateStr, String pattern) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = sdf.parse(dateStr);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}
	public static String convertDateTimeStrFormat(String dateStr, String pattern, String newPattern) throws ParseException{
		return DateTimeUtil.formatCalendar(DateTimeUtil.parseString(dateStr,pattern),newPattern);
	}
	
	public static Calendar parseString(String dateStr)throws ParseException{
		return parseString(dateStr,DEFAULTFORMAT);
	}

    public static long getTimeDifference(){
        long time_one;
        long time_two;
        long time = 0;
        try {
            time_one = new DateTimeUtil().sdf.parse(DEFAULTFORMAT_ONE).getTime();
            Date date = new Date();
            time_two = date.getTime();
            time = (time_two - time_one) / 1000;
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return time;
    }

	 
}
