package com.carey.aprivate.apprescollect.utils;


import android.content.Context;
import android.net.ConnectivityManager;

public class NetworkUT {
    /**
     * Returns whether the network is available
     * 返回是否可用的网络
     *
     * @return
     */
    public static boolean isOpenNetwork(Context context) {
        ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connManager.getActiveNetworkInfo() != null) {
            return connManager.getActiveNetworkInfo().isAvailable();
        }

        return false;
    }
}
