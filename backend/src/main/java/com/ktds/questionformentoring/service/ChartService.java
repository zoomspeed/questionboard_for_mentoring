package com.ktds.questionformentoring.service;

import com.ktds.questionformentoring.vo.chart.BarChartDataVo;

import java.util.List;

public interface ChartService {
    List<BarChartDataVo> getBarChartData() throws Exception;
}
