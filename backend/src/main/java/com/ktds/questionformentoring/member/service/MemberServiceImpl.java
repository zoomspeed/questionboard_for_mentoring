package com.ktds.questionformentoring.member.service;

import com.ktds.questionformentoring.member.entity.MemberManagementDTO;
import com.ktds.questionformentoring.member.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Override
    public List<MemberManagementDTO> searchMemberList() {
        return memberMapper.findAll();
    }

    @Override
    public List<MemberManagementDTO> searchMemberNameList(String mbrNm) {
        return memberMapper.findByMbrNm(mbrNm);
    }

    @Override
    public List<MemberManagementDTO> searchMemberTypeList(String mbrTypeCd) {
        return memberMapper.findByMbrTypeCd(mbrTypeCd);
    }

    @Override
    public void deleteByMbrNo(Long mbrNo) {
        memberMapper.deleteByMbrNo(mbrNo);
    }
}
