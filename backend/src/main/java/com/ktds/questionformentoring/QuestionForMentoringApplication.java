package com.ktds.questionformentoring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan(value = {"com.ktds.questionformentoring.board.mapper"})
@SpringBootApplication
public class QuestionForMentoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionForMentoringApplication.class, args);
	}

}
