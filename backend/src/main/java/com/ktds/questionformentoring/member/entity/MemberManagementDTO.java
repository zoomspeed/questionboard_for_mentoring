package com.ktds.questionformentoring.member.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberManagementDTO {

    private String memberName;          // 회원명
    private String loginId;             // 로그인 아이디
    private String memberTypeCode;      // 회원유형코드
    private String mentorId;            // 멘토아이디
    // private String email;            // *이메일
    private Date memberSubscribeDate;   // 회원가입일시
    private Date lastLoginDate;         // 최종 로그인 일시

    public static MemberManagementDTO fromEntity(Member member) {
        return MemberManagementDTO.builder()
                .memberName(member.getMemberName())
                .loginId(member.getLoginId())
                .memberTypeCode(member.getMemberTypeCode())
                .mentorId(member.getMentorId())
                .memberSubscribeDate(member.getMemberSubscribeDate())
                .lastLoginDate(member.getLastLoginDate())
                .build();
    }
}
