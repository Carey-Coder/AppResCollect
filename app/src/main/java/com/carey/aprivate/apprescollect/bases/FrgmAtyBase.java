package com.carey.aprivate.apprescollect.bases;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;

import com.carey.aprivate.apprescollect.utils.PrintfUT;


/**
 * Created by LiuJie on 2015/11/24.
 */
public abstract class FrgmAtyBase extends FragmentActivity {

    protected Context context;
    protected ApplicationBase mApplication;
    protected int mScreenHeight;//手机屏幕高度参数
    protected int mScreenWidth;//手机屏幕宽度参数

    /**
     * 创建Activity，主要用户初始化界面元素。
     *
     * @param savedInstanceState onSaveInstanceState方法中已保存的数据。
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PrintfUT.LogD(this.getClass().getSimpleName() + " onCreate");
        context = this;
        mApplication = new ApplicationBase();
        GetScreenSize();
        InitOnCreate();
        InitOnData();
        InitTitleBar();
    }

    /**
     * 启动Activity，主要用于调用接口等后台任务。
     */
    @Override
    protected void onStart() {
        super.onStart();
        PrintfUT.LogD(this.getClass().getSimpleName() + " onStart");
    }

    /**
     * 重启Activity，主要用与用户与界面的交互。
     */
    @Override
    protected void onResume() {
        super.onResume();
        PrintfUT.LogD(this.getClass().getSimpleName() + " onResume");
    }

    /**
     * 暂停Activity，主要用于提交还未完成更改的数据到更持久的数据缓存器中。
     */
    @Override
    protected void onPause() {
        super.onPause();
        PrintfUT.LogD(this.getClass().getSimpleName() + " onPause");
    }

    /**
     * 停止Activity，该界面已对用户不可见并可能被进一步的销毁。
     */
    @Override
    protected void onStop() {
        super.onStop();
        PrintfUT.LogD(this.getClass().getSimpleName() + " onStop");
    }

    /**
     * 重启Activity，重新进入已停止的界面时会调用此重启方法，之后将再次调用onStart()方法。
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        PrintfUT.LogD(this.getClass().getSimpleName() + " onRestart");
    }

    /**
     * 销毁Activity，主要用于清空界面中静态的缓存数据，主动释放缓存空间。
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        PrintfUT.LogD(this.getClass().getSimpleName() + " onDestroy");
    }

    /**
     * 保存Activity当前状态，通常保存一些当前界面的阅读位置、图片缓存等；临时数据。<br>
     * 调用条件：1、点击或长按HOME键时；2、关闭屏幕时；3、启动新的Activity时；4、屏幕方向切换时
     *
     * @param outState 将需要保存的内容通过key-value保存到此参数中，可在onCreate的savedInstanceState参数调用以保存的数据。
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        PrintfUT.LogD(this.getClass().getSimpleName() + " onSaveInstanceState");
    }

    /**
     * 获取Activity通过onSaveInstanceState方法保存的状态数据<br>
     * 调用条件：1、确定onSaveInstanceState已被调用；2、确定保存状态的Activity已被销毁。
     *
     * @param savedInstanceState onSaveInstanceState方法中已保存的数据。
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        PrintfUT.LogD(this.getClass().getSimpleName() + " onRestoreInstanceState");
    }

    /**
     * 初始化界面
     */
    protected abstract void InitOnCreate();

    /**
     * 初始化数据
     */
    protected abstract void InitOnData();

    /**
     * 初始化标题栏
     */
    protected abstract void InitTitleBar();

    /**
     * 获取当前手机屏幕宽高参数
     */
    private void GetScreenSize() {
        DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
        this.mScreenWidth = localDisplayMetrics.widthPixels;
        this.mScreenHeight = localDisplayMetrics.heightPixels;
    }
}
