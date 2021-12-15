package com.ktds.questionformentoring.board.controller;

import com.ktds.questionformentoring.board.entity.BoardDTO;
import com.ktds.questionformentoring.board.service.BoardService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@Api(value = "게시판 API", tags = {"Board"})
@RequestMapping("/api/boards")
@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping()
    @ApiOperation(value = "해당 게시판에 있는 모든 게시글들 반환", notes = "<strong>모든 게시글들을 반환한다.</strong>")
    @ApiResponses({
            @ApiResponse(code = 200, message = "성공"),
            @ApiResponse(code = 204, message = "정보 없음"),
            @ApiResponse(code = 500, message = "서버 오류")
    })
    public ResponseEntity<List<BoardDTO>> findAll() {
        try {
            List<BoardDTO> result = boardService.findAll();
            return new ResponseEntity<List<BoardDTO>>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(null, HttpStatus.NO_CONTENT);
        }

    }

    @GetMapping("/{pstartNo}")
    @ApiOperation(value = "게시글 정보 pstartNo로 찾기", notes = "<strong>게시글 pstartNo로 게시글을 찾는다</strong>")
    @ApiResponses({
            @ApiResponse(code = 200, message = "성공"),
            @ApiResponse(code = 204, message = "정보 없음"),
            @ApiResponse(code = 500, message = "서버 오류")
    })
    public ResponseEntity<BoardDTO> findBoardById(
            @PathVariable @ApiParam(value = "게시글 pstartNo", required = true) int pstartNo) {
        try {
            BoardDTO boardDTO = boardService.findById(pstartNo);
            //조회수 +1
            boardDTO.setInqCnt(boardDTO.getInqCnt() + 1);
            boardService.update(boardDTO);
            return new ResponseEntity(boardDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping()
    @ApiOperation(value = "게시글 생성", notes = "<strong>게시판을 생성한다.</strong>")
    @ApiResponses({
            @ApiResponse(code = 200, message = "성공"),
            @ApiResponse(code = 500, message = "서버 오류")
    })
    public ResponseEntity<BoardDTO> writeBoard(
            @RequestBody @ApiParam(value = "게시글 생성 정보", required = true) BoardDTO boardDTO) {
        try {
            BoardDTO result = boardService.write(boardDTO);
            return new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PutMapping()
    @ApiOperation(value = "게시글 수정", notes = "<strong>pstartNo가 일치하는 게시글을 수정한다.</strong></br>수정하고 싶은 항목들만 작성하면 된다.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "성공"),
            @ApiResponse(code = 500, message = "서버 오류")
    })
    public ResponseEntity<BoardDTO> updateBoard(@RequestBody BoardDTO boardDTO) {
        try {
            boardService.update(boardDTO);
            BoardDTO boardRes = boardService.findById(boardDTO.getPstartNo());
            return new ResponseEntity(boardRes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{pstartNo}")
    @ApiOperation(value = "게시글 삭제", notes = "<strong>pstartNo가 일치하는 게시글을 삭제한다.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "성공"),
            @ApiResponse(code = 500, message = "서버 오류")
    })
    public ResponseEntity deleteBoard(@PathVariable int pstartNo) {
        try {
            boardService.delete(pstartNo);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
