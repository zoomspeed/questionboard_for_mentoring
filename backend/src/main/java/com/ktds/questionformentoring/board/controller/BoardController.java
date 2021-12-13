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

    @GetMapping("/board/{pstartNo}")
    public BoardDTO getBoardInfo(@PathVariable("pstartNo") int pstartNo){
        BoardDTO result = boardService.findById(pstartNo);
        return result;
    }
//    @PostMapping
//    @PutMapping
//    @DeleteMapping


}
