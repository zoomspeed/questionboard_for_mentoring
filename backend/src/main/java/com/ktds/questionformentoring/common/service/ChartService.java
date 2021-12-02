package com.ktds.questionformentoring.common.service;

import com.ktds.questionformentoring.common.vo.chart.BarChartDataVo;

import java.util.List;

public interface ChartService {
    List<BarChartDataVo> getBarChartData() throws Exception;
}
