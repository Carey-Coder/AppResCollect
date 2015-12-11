package com.carey.aprivate.apprescollect.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by LiuJie on 2015/10/27.
 */
public class IntentUT {
    public static void openActivity(Context context, Class<?> clss) {
        Intent intent = new Intent(context, clss);
        context.startActivity(intent);
    }

    public static void openActivity(Context context, Class<?> clss, Bundle bundle) {
        Intent intent = new Intent(context, clss);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
