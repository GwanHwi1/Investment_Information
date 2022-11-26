package com.example.investment_information.controller;

import com.example.investment_information.dto.MemberDto;
import com.example.investment_information.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemberController {
    public final Logger logger = LoggerFactory.getLogger(MemberController.class);

    private final MemberService service;

    @PostMapping("/getId")
    public String getId(MemberDto dto) {
        logger.info("MemberController getId()");
        boolean b = service.getId(dto);
        if(b) {
            return "no";
        }

        return "ok";

    }

    @PostMapping("/addMember")
    public String addMember(MemberDto dto) {
        logger.info("MemberController addMember()");
        boolean b = service.addMember(dto);

        logger.info(dto.toString());

        if(b) {
            return "ok";
        }

        return "no";
    }

    @PostMapping("/login")
    public MemberDto login(MemberDto dto) {
        logger.info("MemberController login()");
        return service.login(dto);
    }
}
