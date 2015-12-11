package com.carey.aprivate.apprescollect.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by LiuJie on 2015/11/4.
 */
public class PrintfUT {
    private static boolean isDebug = true;
    private static final String TAG_I = "APP_INFO";
    private static final String TAG_W = "APP_WARN";
    private static final String TAG_E = "APP_ERROR";
    private static final String TAG_D = "APP_DEBUG";
    private static final String TAG_V = "APP_VERBOSE";

    public void setIsDebug(boolean isDebug) {
        PrintfUT.isDebug = isDebug;
    }

    public static void showShortToast(Context context, String Msg) {
        Toast.makeText(context, Msg, Toast.LENGTH_SHORT).show();
    }

    public static void showLongToast(Context context, String Msg) {
        Toast.makeText(context, Msg, Toast.LENGTH_LONG).show();
    }


    public static void LogV(String msg) {
        if (isDebug)
            Log.v(TAG_V, msg);
    }

    public static void LogV(Context context, String msg) {
        if (isDebug)
            Log.v(TAG_V, context.getClass().getSimpleName() + " " + msg);
    }

    public static void LogV(String msg, Throwable t) {
        if (isDebug)
            Log.v(TAG_V, msg, t);
    }

    public static void LogV(Context context, String msg, Throwable t) {
        if (isDebug)
            Log.v(TAG_V, context.getClass().getSimpleName() + " " + msg, t);
    }

    public static void LogD(String msg) {
        if (isDebug)
            Log.d(TAG_D, msg);
    }

    public static void LogD(Context context, String msg) {
        if (isDebug)
            Log.v(TAG_D, context.getClass().getSimpleName() + " " + msg);
    }

    public static void LogD(String msg, Throwable t) {
        if (isDebug)
            Log.d(TAG_D, msg, t);
    }

    public static void LogD(Context context, String msg, Throwable t) {
        if (isDebug)
            Log.v(TAG_D, context.getClass().getSimpleName() + " " + msg, t);
    }

    public static void LogI(String msg) {
        if (isDebug)
            Log.i(TAG_I, msg);
    }

    public static void LogI(Context context, String msg) {
        if (isDebug)
            Log.v(TAG_I, context.getClass().getSimpleName() + " " + msg);
    }

    public static void LogI(String msg, Throwable t) {
        if (isDebug)
            Log.i(TAG_I, msg, t);
    }

    public static void LogI(Context context, String msg, Throwable t) {
        if (isDebug)
            Log.v(TAG_I, context.getClass().getSimpleName() + " " + msg, t);
    }

    public static void LogW(String msg) {
        if (isDebug)
            Log.w(TAG_W, msg);
    }

    public static void LogW(Context context, String msg) {
        if (isDebug)
            Log.v(TAG_W, context.getClass().getSimpleName() + " " + msg);
    }

    public static void LogW(String msg, Throwable t) {
        if (isDebug)
            Log.w(TAG_W, msg, t);
    }

    public static void LogW(Context context, String msg, Throwable t) {
        if (isDebug)
            Log.v(TAG_W, context.getClass().getSimpleName() + " " + msg, t);
    }

    public static void LogE(String msg) {
        if (isDebug)
            Log.e(TAG_E, msg);
    }

    public static void LogE(Context context, String msg) {
        if (isDebug)
            Log.v(TAG_E, context.getClass().getSimpleName() + " " + msg);
    }

    public static void LogE(String msg, Throwable t) {
        if (isDebug)
            Log.e(TAG_E, msg, t);
    }

    public static void LogE(Context context, String msg, Throwable t) {
        if (isDebug)
            Log.v(TAG_E, context.getClass().getSimpleName() + " " + msg, t);
    }
}

