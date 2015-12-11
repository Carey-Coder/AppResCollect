package com.carey.aprivate.apprescollect.bases;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carey.aprivate.apprescollect.utils.PrintfUT;


/**
 * Created by LiuJie on 2015/11/24.
 */
public abstract class FrgmBase extends Fragment {

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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PrintfUT.LogD(this.getClass().getSimpleName() + " onCreate");
        mApplication = new ApplicationBase();
        context = getActivity();
        GetScreenSize();
        InitOnData();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /**
     * 启动Activity，主要用于调用接口等后台任务。
     */
    @Override
    public void onStart() {
        super.onStart();
        PrintfUT.LogD(this.getClass().getSimpleName() + " onStart");
    }

    /**
     * 重启Activity，主要用与用户与界面的交互。
     */
    @Override
    public void onResume() {
        super.onResume();
        PrintfUT.LogD(this.getClass().getSimpleName() + " onResume");
    }

    /**
     * 暂停Activity，主要用于提交还未完成更改的数据到更持久的数据缓存器中。
     */
    @Override
    public void onPause() {
        super.onPause();
        PrintfUT.LogD(this.getClass().getSimpleName() + " onPause");
    }

    /**
     * 停止Activity，该界面已对用户不可见并可能被进一步的销毁。
     */
    @Override
    public void onStop() {
        super.onStop();
        PrintfUT.LogD(this.getClass().getSimpleName() + " onStop");
    }

    /**
     * 销毁Activity，主要用于清空界面中静态的缓存数据，主动释放缓存空间。
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        PrintfUT.LogD(this.getClass().getSimpleName() + " onDestroy");
    }

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
