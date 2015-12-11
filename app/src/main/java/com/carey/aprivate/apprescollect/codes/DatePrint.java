package com.carey.aprivate.apprescollect.codes;

import android.text.format.Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 2015年10月15日00:37:06 P20行应该打印为14:30:45 可是却打印为02:30:45.后计算发现应为时差的毫秒为7200000。问题的原因需再分析。
 * Created by LiuJie on 2015/10/14.
 */
public class DatePrint {
    public static void main(String[] strs) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long nowMS = System.currentTimeMillis();//获取当前时间的毫秒值
        Date curDate = new Date(nowMS);//获取当前时间
        String str = formatter.format(curDate);
        System.out.println(str);//当前时间：2015-10-15 00:02:08
        System.out.println(MillisecondToDate(1316493045000L));//根据毫秒转换为日期：2011-09-20 12:30:45
        System.out.println(MillisecondToDateTimeDifferences(1316493045000L, 2, true));//根据毫秒转换为日期：2011-09-20 14:30:45
        System.out.println(MillisecondToDateTimeDifferences(1316493045000L, 2, false));//根据毫秒转换为日期：2011-09-20 12:30:45
        System.out.println(DateToMillisecond("2011-09-20 14:30:45"));//根据制定日期转换为毫秒：1316493045000L
    }

    /**
     * 根据指定毫秒值求得日期
     *
     * @param millisecond 指定的毫秒值
     * @return
     */
    public static String MillisecondToDate(long millisecond) {
        Date dat = new Date(millisecond);
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(dat);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return format.format(gc.getTime());
    }

    /**
     * 根据指定日期求得毫秒值
     *
     * @param date 指定的日期（需要统一日期格式：yyyy-MM-dd HH:mm:ss）
     * @return
     */
    public static String DateToMillisecond(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long timeStart = 0;
        try {
            timeStart = sdf.parse(date).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return String.valueOf(timeStart);
    }

    /**
     * 根据毫秒 将毫秒的日期带时差求得新的日期。
     *
     * @param millisecond 毫秒值
     * @param Diff        小时差
     * @param type        true:往后增加时差；false：往前减小时差
     * @return
     */
    public static String MillisecondToDateTimeDifferences(long millisecond, int Diff, boolean type) {
        Date dat;
        if (type) {
            dat = new Date(millisecond + (Diff * 60 * 60 * 1000));
        } else {
            dat = new Date(millisecond - (Diff * 60 * 60 * 1000));
        }
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(dat);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return format.format(gc.getTime());
    }

    public static void getTimeNowData() {
        Time t = new Time("GMT+8"); // or Time t=new Time("GMT+8"); 加上Time Zone资料。
        t.setToNow(); // 取得系统时间。
        int year = t.year;
        int month = t.month;
        int date = t.monthDay;
        int hour = t.hour; // 0-23
        int minute = t.minute;
        int second = t.second;
    }

    public static void getCalendarData() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
    }
}
