package com.ktds.questionformentoring.member.service;

import com.ktds.questionformentoring.member.entity.MemberDTO;
import com.ktds.questionformentoring.member.entity.MemberManagementDTO;

import java.util.List;

public interface MemberService {

    // 유저 저장
    public MemberDTO save(MemberDTO memberDTO);

    // 관리자 페이지 - 유저리스트 조회
    public List<MemberManagementDTO> searchMemberList();

    // 관리자 페이지 - 유저 이름 검색
    public List<MemberManagementDTO> searchMemberNameList(String mbrNm);

    // 관리자 페이지 - 유저 유형 검색 (멘토, 멘티)
    public List<MemberManagementDTO> searchMemberTypeList(String mbrTypeCd);

    // 관리자 페이지 - 유저 삭제
    public void deleteByMbrNo(Long mbrNo);
}
