package com.ktds.questionformentoring.board.mapper;

import com.ktds.questionformentoring.board.entity.BoardDTO;

import java.util.List;


public interface BoardMapper {

    /* 글작성 */
    public void write(BoardDTO boardVo);
    /* 글 목록 조회 */
    public List<BoardDTO> findAll();
    /* 글 단건 조회 */
    public BoardDTO findById(int pstartNo);
    /* 글 수정 */
    public void update(BoardDTO boardDTO);
    /* 글 삭제 */
    public void delete(int pstartNo);
}
