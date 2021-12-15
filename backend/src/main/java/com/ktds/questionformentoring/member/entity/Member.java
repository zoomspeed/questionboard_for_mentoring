package com.ktds.questionformentoring.member.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {

    private Long mbrNo;         // 회원번호
    private String mbtNm;       // 회원명
    private String loginId;     // 로그인 아이디
    private String loginPwd;    // 로그인 비밀번호
    private String mbtTypeCd;   // 회원유형코드
    private String mtrId;       // 멘토아이디
    private String telno;       // 전화번호
    private Date mbrSbscDt;     // 회원가입일시
    private Date rtrmmbDta;     // 탈퇴일시
    private String rtrmmbWhyCd; // 탈퇴사유코드
    private Date lastLoginDt;   // 최종 로그인 일시
    private Date pwdChgDate;    // 비밀번호 변경일자
    private Date infoAmdDt;     // 정보 수정일자
}
