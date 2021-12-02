package com.ktds.questionformentoring.common.controller;

import com.ktds.questionformentoring.common.service.ChartService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value="