package com.ktds.questionformentoring.board.controller;

import com.ktds.questionformentoring.board.entity.BoardDTO;
import com.ktds.questionformentoring.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

//    @GetMapping("/board")
//    public BoardDTO test(){
//        return ;
//    }
//    @PostMapping
//    @PutMapping
//    @DeleteMapping


}
