package com.ktds.questionformentoring.board.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ktds.questionformentoring.board.entity.BoardDTO;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
class BoardServiceImplTest {

    @Autowired
    BoardServiceImpl boardServiceImpl;

    @Test
    void write() {


        BoardDTO boardDTO = new BoardDTO();
//        boardDTO.setPstartNo(1);
        boardDTO.setRgtrId("id");
        boardDTO.setRgtrNm("name");
        boardDTO.setRgtrMbrCd("공통코드");
//        boardDTO.setRegDt("timestamp");
        boardDTO.setPstartTitlNm("게시물 제목명");
        boardDTO.setPstartCn("게시물 내용");
        boardDTO.setInqCnt(1);
        boardDTO.setCmntCnt(3);
        boardDTO.setSlctnYn('N');
        boardDTO.setMbrNo(11);
        boardServiceImpl.write(boardDTO);


    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}