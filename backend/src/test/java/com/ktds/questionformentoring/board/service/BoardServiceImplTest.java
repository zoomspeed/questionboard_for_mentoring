package com.ktds.questionformentoring.board.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ktds.questionformentoring.board.entity.BoardDTO;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;


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
        List<BoardDTO> result = boardServiceImpl.findAll();
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i).getPstartTitlNm());
        }
    }

    @Test
    void findById() {
        BoardDTO result = boardServiceImpl.findById(3);
        assertThat(result.getPstartNo()).isEqualTo(3);
        System.out.println("result = " + result.getPstartNo());
    }

    @Test
    void update() {
        BoardDTO boardDTO2 = new BoardDTO();
        boardDTO2.setPstartNo(7);
        boardDTO2.setRgtrId("id");
        boardDTO2.setRgtrNm("name");
        boardDTO2.setRgtrMbrCd("공통코드");
//        boardDTO.setRegDt("timestamp");
        boardDTO2.setPstartTitlNm("update 후");
        boardDTO2.setPstartCn("update 후");
        boardDTO2.setInqCnt(1);
        boardDTO2.setCmntCnt(3);
        boardDTO2.setSlctnYn('N');
        boardDTO2.setMbrNo(11);
        boardServiceImpl.update(boardDTO2);
        List<BoardDTO> result = boardServiceImpl.findAll();
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i).getPstartTitlNm());
        }
    }

    @Test
    void delete() {
        BoardDTO result = boardServiceImpl.findById(7);
        System.out.println("result = " + result.getPstartNo());
        boardServiceImpl.delete(7);
        assertThat(boardServiceImpl.findById(7)).isEqualTo(null);
    }
}