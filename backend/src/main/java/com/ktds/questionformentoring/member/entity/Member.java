package com.ktds.questionformentoring.member.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {

    private Long memberNumber;          // 회원번호
    private String memberName;          // 회원명
    private String loginId;             // 로그인 아이디
    private String loginPassword;       // 로그인 비밀번호
    private String memberTypeCode;      // 회원유형코드
    private String mentorId;            // 멘토아이디
    private String email;               // 이메일
    private Date memberSubscribeDate;   // 회원가입일시
    private Date retiredDate;           // 탈퇴일시
    private String retiredWhyCode;      // 탈퇴사유코드
    private Date lastLoginDate;         // 최종 로그인 일시
    private Date passwordChangeDate;    // 비밀번호 변경일자
    private Date infoModifyDate;        // 정보 수정일자
}
