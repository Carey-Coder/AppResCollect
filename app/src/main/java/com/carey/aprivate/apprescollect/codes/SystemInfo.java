package com.carey.aprivate.apprescollect.codes;

/**
 * Created by LiuJie on 2015/9/8.
 */
public class SystemInfo {
    public static void main(String[] args) {
        //手机系统信息获取：
        String phoneInfo = "Product： " + android.os.Build.PRODUCT + "\n";
        phoneInfo += "CPU_ABI： " + android.os.Build.CPU_ABI + "\n";
        phoneInfo += "TAGS： " + android.os.Build.TAGS + "\n";
        phoneInfo += "VERSION_CODES.BASE： " + android.os.Build.VERSION_CODES.BASE + "\n";
        phoneInfo += "MODEL： " + android.os.Build.MODEL + "\n";
        phoneInfo += "SDK： " + android.os.Build.VERSION.SDK + "\n";
        phoneInfo += "VERSION.RELEASE： " + android.os.Build.VERSION.RELEASE + "\n";
        phoneInfo += "DEVICE： " + android.os.Build.DEVICE + "\n";
        phoneInfo += "DISPLAY： " + android.os.Build.DISPLAY + "\n";
        phoneInfo += "BRAND： " + android.os.Build.BRAND + "\n";
        phoneInfo += "BOARD： " + android.os.Build.BOARD + "\n";
        phoneInfo += "FINGERPRINT： " + android.os.Build.FINGERPRINT + "\n";
        phoneInfo += "ID： " + android.os.Build.ID + "\n";
        phoneInfo += "MANUFACTURER： " + android.os.Build.MANUFACTURER + "\n";
        phoneInfo += "USER： " + android.os.Build.USER + "\n";
        System.out.println(phoneInfo);
        //手机应用信息获取：(因为manager需要context，所以暂时注释)
//        PackageManager manager;
//        PackageInfo info = null;
//        manager = this.getPackageManager();
//        try {
//            info = manager.getPackageInfo(this.getPackageName(), 0);
//            int versionCode = info.versionCode;
//            String versionName = info.versionName;
//            String packageName = info.packageName;
//            System.out.println("" + versionCode + "\n" + versionName + "\n" + packageName);
//        } catch (PackageManager.NameNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
