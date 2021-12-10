package com.ktds.questionformentoring.board.controller;

import com.ktds.questionformentoring.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;
//주석
    @GetMapping("/mybatis-test")
    public String test(){

        System.out.println(boardService.testSelect());
        return boardService.testSelect();
    }
}
