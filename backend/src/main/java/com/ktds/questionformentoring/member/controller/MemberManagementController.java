package com.ktds.questionformentoring.member.controller;

import com.ktds.questionformentoring.member.entity.MemberManagementDTO;
import com.ktds.questionformentoring.member.service.MemberService;
import com.ktds.questionformentoring.member.service.MemberServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"}, maxAge = 6000)
@Slf4j
@Api(value = "관리자 유저게시판 API", tags = {"admin user management"})
@RestController
@RequestMapping("/api/admin/member")
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
        log.info("GET /api/admin/member/list HTTP/1.1");
        return memberServiceImpl.searchMemberList();
    }

    @GetMapping("/list/{mbrNm}")
    @ApiOperation(value = "유저리스트 이름 조회", notes = "유저리스트 이름으로 검색")
    @ApiResponses({
            @ApiResponse(code = 200, message = "성공"),
            @ApiResponse(code = 204, message = "정보 없음"),
            @ApiResponse(code = 500, message = "서버 오류")
    })
    public List<MemberManagementDTO> searchNameList(@PathVariable String mbrNm) {
        log.info("GET /api/admin/member/list/{mbrNm} HTTP/1.1");
        return memberServiceImpl.searchMemberNameList(mbrNm);
    }

    @GetMapping("/list/{mbrTypeCd}")
    @ApiOperation(value = "유저리스트 타입 조회", notes = "유저리스트 멘토, 멘티로 검색")
    @ApiResponses({
            @ApiResponse(code = 200, message = "성공"),
            @ApiResponse(code = 204, message = "정보 없음"),
            @ApiResponse(code = 500, message = "서버 오류")
    })
    public List<MemberManagementDTO> searchTypeList(@PathVariable String mbrTypeCd) {
        log.info("GET /api/admin/member/list/{mbrTypeCd} HTTP/1.1");
        return memberServiceImpl.searchMemberTypeList(mbrTypeCd);
    }

    @DeleteMapping("/{mbrNo}")
    @ApiOperation(value = "유저 삭제", notes = "유저리스트에서 삭제")
    @ApiResponses({
            @ApiResponse(code = 200, message = "성공"),
            @ApiResponse(code = 204, message = "정보 없음"),
            @ApiResponse(code = 500, message = "서버 오류")
    })
    public ResponseEntity deleteMember(@PathVariable Long mbrNo) {
        log.info("DELETE /api/admin/member/{mbrNo} HTTP/1.1");
        memberServiceImpl.deleteByMbrNo(mbrNo);
        return new ResponseEntity(HttpStatus.OK);
    }

}
