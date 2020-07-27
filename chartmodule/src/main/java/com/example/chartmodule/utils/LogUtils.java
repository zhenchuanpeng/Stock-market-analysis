package com.example.chartmodule.utils;

import android.util.Log;

/**
 * @author pzc
 * @des 日志工具类
 */
public class LogUtils {

  private static final String TAG = "guannan_log";

  public static void d(String msg) {
    Log.d(TAG, "d: " + msg);
  }
}
