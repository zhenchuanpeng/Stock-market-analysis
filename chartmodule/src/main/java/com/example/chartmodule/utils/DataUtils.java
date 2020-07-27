package com.example.chartmodule.utils;

/**
 * @author pzc
 * @des 常量
 */
public class DataUtils {

  /**
   * +0
   */
  public static float EPSILON = 0.0000001f;

  /**
   * -0
   */
  public static float EPSILONNGT = -0.0000001f;

  /**
   * 浮点零值判定
   */
  public static boolean isZero(float val) {
    return (val > EPSILONNGT && val < EPSILON);
  }
}
