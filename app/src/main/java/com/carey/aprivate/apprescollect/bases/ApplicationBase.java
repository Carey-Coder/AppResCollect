package com.carey.aprivate.apprescollect.bases;

import android.app.Application;
import android.content.res.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiuJie on 2015/11/4.
 */
public class ApplicationBase extends Application {
    /**
     * 启动时的全局缓存数据（不建议二次更改）
     */
    private static Map<String, Object> Cache = new HashMap<String, Object>();
    /**
     * 跳转时存放的复杂数据（可更改）
     */
    private static Map<String, Object> Transmit = new HashMap<String, Object>();
    /**
     * 临时存放的数据（可清除）
     */
    private static Map<String, Object> Temporary = new HashMap<String, Object>();

    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     * 在改变屏幕方向、弹出软件盘和隐藏软键盘时,不再去执行onCreate()方法,而是直接执行此方法。
     *
     * @param newConfig
     */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    /**
     * OnLowMemory是Android提供的API，在系统内存不足，所有后台程序（优先级为background的进程，不是指后台运行的进程）都被杀死时，系统会调用OnLowMemory。
     */
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    /**
     * OnTrimMemory是Android 4.0之后提供的API，系统会根据不同的内存状态来回调。
     */
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    /**
     * 当终止应用程序对象时调用，不保证一定被调用，当程序是被内核终止以便为其他应用程序释放资源，那么将不会提醒，并且不调用应用程序的对象的onTerminate方法而直接终止进程
     */
    @Override
    public void onTerminate() {
        super.onTerminate();
    }
    /**
     * OnLowMemory和OnTrimMemory的比较
     * 1，OnLowMemory被回调时，已经没有后台进程；而onTrimMemory被回调时，还有后台进程。
     * 2，OnLowMemory是在最后一个后台进程被杀时调用，一般情况是low memory killer 杀进程后触发；而OnTrimMemory的触发更频繁，每次计算进程优先级时，只要满足条件，都会触发。
     * 3，通过一键清理后，OnLowMemory不会被触发，而OnTrimMemory会被触发一次。
     */
}
