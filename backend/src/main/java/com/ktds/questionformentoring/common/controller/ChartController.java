package com.ktds.questionformentoring.common.controller;

import com.ktds.questionformentoring.common.ResponseMsg;
import com.ktds.questionformentoring.common.service.ChartService;
import com.ktds.questionformentoring.common.vo.chart.BarChartDataVo;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/v1/chart")
@ApiResponses({
        @ApiResponse(code=200, message="OK"),
        @ApiResponse(code=400, message="Bad Request"),
        @ApiResponse(code=401, message="Unauthorized"),
        @ApiResponse(code=404, message="Not Found"),
        @ApiResponse(code=409, message="Conflict"),
        @ApiResponse(code=500, message="Internal Server errors"),
})
public class ChartController {

    protected static final Logger LOG = LoggerFactory.getLogger(ChartController.class);

    @Autowired
    ChartService chartService;
    @RequestMapping(value="/getBarChartData", method= {RequestMethod.GET})
    public ResponseMsg getBarChartData(HttpServletRequest request) throws Exception {
        Locale locale = request.getLocale();

        List<BarChartDataVo> chartData = null;

        try {
            chartData = chartService.getBarChartData();
        } catch (Exception ex) {
            throw ex;
        }

        return new ResponseMsg("TX_SUCCESS", chartData);
    }
}
