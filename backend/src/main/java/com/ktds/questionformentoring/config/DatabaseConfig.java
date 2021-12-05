package com.ktds.questionformentoring.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(
        basePackages = "com.ktds.questionformentoring.board.mapper"
)
public class DatabaseConfig {}

