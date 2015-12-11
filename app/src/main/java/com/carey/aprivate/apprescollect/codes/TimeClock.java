package com.carey.aprivate.apprescollect.codes;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by LiuJie on 2015/9/8.
 */
public class TimeClock {
    public void TimerCount() {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int position = 0;

            @Override
            public void run() {
                if (position >= 4) this.cancel();//当循环执行五次后结束线程
                Calendar calendar = Calendar.getInstance();
                String NowTime = calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-" + (calendar.get(Calendar.DAY_OF_MONTH)) + " " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND);
                System.out.println(NowTime);
                position++;
            }
        };
        timer.schedule(timerTask, 0, 1000);
    }

    public static void main(String[] strs) throws InterruptedException {
        TimeClock timerTest = new TimeClock();
        System.out.println("============== 开始执行 计时器 ============");
        timerTest.TimerCount();
        System.out.println("============== 计时线程等待开始 ============");
        synchronized (timerTest) {
            try {
                System.out.println("============== 计时线程等待中 ============");
                timerTest.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("============== 计时线程等待结束 ============");
    }
}
