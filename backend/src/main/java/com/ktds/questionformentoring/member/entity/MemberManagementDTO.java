package com.ktds.questionformentoring.member.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class MemberManagementDTO {

    private int mbrNo;         // 회원번호
    private String mbrNm;       // 회원명
    private String loginId;     // 로그인 아이디
    private String mbrTypeCd;   // 회원유형코드
    private String telno;       // 전화번호
    private String mtrId;       // 멘토아이디
    private Date mbrSbscDt;     // 회원가입일시
    private Date lastLoginDt;   // 최종 로그인 일시

}
