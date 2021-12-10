package com.ktds.questionformentoring.comment.controller;

import com.ktds.questionformentoring.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
public class CommentController {

    @Autowired
    private CommentService boardService;
//주석
    @GetMapping("/mybatis-test")
    public String test(){

        System.out.println(boardService.testSelect());
        return boardService.testSelect();
    }
}
