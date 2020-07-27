package com.example.chartmodule.inter;

import android.view.MotionEvent;

/**
 * @author pzc
 * @des TODO
 */
public interface IPressChangeListener {

  void onChartTranslate(MotionEvent me, float dX);

  void onChartFling(float distanceX);

  void onChartScale(MotionEvent me, float scaleX, float scaleY);
}
