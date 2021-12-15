package com.ktds.questionformentoring.admin.boardManagement.controller;

import com.ktds.questionformentoring.admin.boardManagement.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@Slf4j
@Controller
@RequestMapping("/admin")
public class BoardManagementController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/")
    public String adminTest() {
        log.info("admin page");
        return "";
    }
}
