package com.ktds.questionformentoring.board.service;

import com.ktds.questionformentoring.board.entity.BoardDTO;
import com.ktds.questionformentoring.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public BoardDTO write(BoardDTO boardDTO) {
        return boardMapper.write(boardDTO);
    }

    @Override
    public List<BoardDTO> findAll() {
        return boardMapper.findAll();
    }

    @Override
    public BoardDTO findById(int pstartNo) {
        return boardMapper.findById(pstartNo);
    }

    @Override
    public void update(BoardDTO boardDTO) {
        boardMapper.update(boardDTO);
    }

    @Override
    public void delete(int pstartNo) {
        boardMapper.delete(pstartNo);
    }
}
