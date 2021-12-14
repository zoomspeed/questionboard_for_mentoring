package com.ktds.questionformentoring.member.service;

import com.ktds.questionformentoring.member.entity.MemberManagementDTO;
import com.ktds.questionformentoring.member.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    public List<MemberManagementDTO> searchMemberList() {
        return memberMapper.findAll()
                .stream().map(MemberManagementDTO::fromEntity)
                .collect(Collectors.toList());
    }
}
