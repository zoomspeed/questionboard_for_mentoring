package com.ktds.questionformentoring.common.service.impl;

import com.ktds.questionformentoring.common.util.CommonUtil;
import com.ktds.questionformentoring.common.service.ChartService;
import com.ktds.questionformentoring.common.vo.chart.BarChartDataVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChartServiceImpl implements ChartService {

    protected final static Logger LOG = LoggerFactory.getLogger(ChartServiceImpl.class);

    @Override
    public List<BarChartDataVo> getBarChartData() {

        List<BarChartDataVo> barChartDataList = new ArrayList<BarChartDataVo>();

        for(int i=0; i<10; i++) {
            BarChartDataVo vo = BarChartDataVo.builder()
                    .quarter(String.format("0%s", i))
                    .sales(String.valueOf(CommonUtil.getRandomInt(10, 50))).build();

            barChartDataList.add(vo);
        }

        return barChartDataList;
    }
}
