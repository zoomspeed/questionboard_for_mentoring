package com.ktds.questionformentoring.common.vo.chart;

import lombok.Builder;
import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class BarChartDataVo {
    @NotNull private String quarter;
    @NotNull private String sales;
}
