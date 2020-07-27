package com.example.chartmodule.inter;


import com.example.chartmodule.data.ExtremeValue;
import com.example.chartmodule.data.SubChartData;

/**
 * @author pzc
 * @des 行情图数据准备完毕回调
 */
public interface IChartDataCountListener<T> {

  void onReady(T data, ExtremeValue extremeValue, SubChartData subChartData);
}
