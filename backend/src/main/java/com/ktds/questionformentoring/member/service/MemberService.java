package com.ktds.questionformentoring.member.service;

import com.ktds.questionformentoring.member.entity.MemberManagementDTO;

import java.util.List;

public interface MemberService {

    // 관리자 페이지 - 유저리스트 조회
    public List<MemberManagementDTO> searchMemberList();

    // 관리자 페이지 - 유저 이름 검색

    // 관리자 페이지 - 유저 유형 검색 (멘토, 멘티)
}
