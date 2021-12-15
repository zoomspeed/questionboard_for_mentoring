package com.ktds.questionformentoring.member.mapper;

import com.ktds.questionformentoring.member.entity.Member;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    final String findAll = "SELECT * FROM MBR_BAS";

    // 유저 저장

    // 유저리스트 조회
    @Results({
            @Result(property = "memberNumber", column = "MBR_NO", id = true),
            @Result(property = "memberName", column = "MBR_NM"),
            @Result(property = "loginId", column = "LOGIN_ID"),
            @Result(property = "loginPassword", column = "LOGIN_PWD"),
            @Result(property = "memberTypeCode", column = "MBR_TYPE_CD"),
            @Result(property = "mentorId", column = "MTR_ID"),
            @Result(property = "email", column = "EMAIL"),
            @Result(property = "memberSubscribeDate", column = "MBR_SBSC_DT"),
            @Result(property = "retiredDate", column = "RTRMMB_DT"),
            @Result(property = "retiredWhyCode", column = "RTRMMB_WHY_CD"),
            @Result(property = "lastLoginDate", column = "LAST_LOGIN_DT"),
            @Result(property = "passwordChangeDate", column = "PWD_CHG_DATE"),
            @Result(property = "infoModifyDate", column = "INFO_AMD_DATE")
    })
    @Select(findAll)
    List<Member> findAll();


    // 유저 이름 검색

    // 유저 유형 검색 (멘토, 멘티)
}
