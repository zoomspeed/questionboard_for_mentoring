package com.ktds.questionformentoring.board.service;

import com.ktds.questionformentoring.board.entity.BoardVo;
import com.ktds.questionformentoring.board.mapper.BoardMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements  BoardService{

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public BoardVo testSelect() {
        return boardMapper.testSelect();
    }
}
