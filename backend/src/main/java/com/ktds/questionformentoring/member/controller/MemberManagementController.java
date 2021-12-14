package com.ktds.questionformentoring.member.controller;

import com.ktds.questionformentoring.member.entity.MemberManagementDTO;
import com.ktds.questionformentoring.member.service.MemberServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"*"}, maxAge = 6000)
@Slf4j
@Api(value = "관리자 유저게시판 API", tags = {"admin user management"})
@RestController
@RequestMapping("/api/admin/user")
@RequiredArgsConstructor
public class MemberManagementController {

    private final MemberServiceImpl memberServiceImpl;

    @GetMapping("/list")
    @ApiOperation(value = "유저리스트 조회", notes = "유저리스트 전체 조회")
    @ApiResponses({
            @ApiResponse(code = 200, message = "성공"),
            @ApiResponse(code = 204, message = "정보 없음"),
            @ApiResponse(code = 500, message = "서버 오류")
    })
    public List<MemberManagementDTO> searchMemberList() {
        log.info("GET /api/admin/user/list HTTP/1.1");
        return memberServiceImpl.searchMemberList();
    }
}
