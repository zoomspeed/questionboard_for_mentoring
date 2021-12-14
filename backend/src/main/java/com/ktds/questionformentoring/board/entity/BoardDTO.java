package com.ktds.questionformentoring.board.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class BoardDTO {
    //    private int testId;
    //    private String testTitle;
    /* 게시물번호 */
    private int pstartNo;
    /* 등록자아이디 */
    private String rgtrId;
    /* 등록자명 */
    private String rgtrNm;
    /* 등록자회원코드 */
    private String rgtrMbrCd;
    /* 등록일시 */
    private String regDt;
    /* 게시물제목명 */
    private String pstartTitlNm;
    /* 게시물내용 */
    private String pstartCn;
    /* 조회수 */
    private int inqCnt;
    /* 댓글수 */
    private int cmntCnt;
    /* 선정여부 */
    private char slctnYn;
    /* 회원번호 */
    private int mbrNo;

}
