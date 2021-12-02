package com.ktds.questionformentoring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Configuration
@EnableSwagger2
@Profile({ "!prd" })
public class SwaggerConfig {
    // 호출 url: http://localhost:8080/swagger-ui.html

    /**
     * Docket를 생성하는 메소드
     *
     * @return Docket
     */
    @Bean
    public Docket api() {

        ParameterBuilder parameterBuilder = new ParameterBuilder();

        Parameter accTokenParam =
                parameterBuilder.name("Authorization") // 헤더 이름
                        .description("Access Token") // 설명
                        .modelRef(new ModelRef("string"))
                        .parameterType("header")
                        .required(false)
                        .build();

        Parameter xAuthToken =
                parameterBuilder.name("X-Auth-Token") // 헤더 이름
                        .description("Session Id") // 설명
                        .modelRef(new ModelRef("string"))
                        .parameterType("header")
                        .required(false)
                        .build();

        List<Parameter> params = new ArrayList<>();
        params.add(accTokenParam);
        params.add(xAuthToken);

        return new Docket(DocumentationType.SWAGGER_2)
                .globalOperationParameters(params)
                .useDefaultResponseMessages(false)
                .consumes(getConsumeContentTypes())
                .produces(getProduceContentTypes()).apiInfo(getApiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.ktds.questionformentoring.controller"))
                .paths(PathSelectors.ant("/**/*")).build();
    }

    /**
     * ApiInfo를 생성하는 메소드
     *
     * @return ApiInfo
     */
    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder().title("KTDS Mentoring backend API")
                .description("KTDS Mentoring backend API").version("1.0").build();
    }

    private Set<String> getConsumeContentTypes() {
        Set<String> consumes = new HashSet<>();
        consumes.add("application/json;charset=UTF-8");
//        consumes.add("application/x-www-form-urlencoded");
        return consumes;
    }

    private Set<String> getProduceContentTypes() {
        Set<String> produces = new HashSet<>();
        produces.add("application/json;charset=UTF-8");
        return produces;
    }
}