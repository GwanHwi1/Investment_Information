package com.example.investment_information.service;

import com.example.investment_information.dao.MemberDao;
import com.example.investment_information.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberDao dao;

    public boolean getId(MemberDto dto) {
        int n = dao.getId(dto);
        return n > 0;
    }

    public boolean addMember(MemberDto dto) {
        int n = dao.addMember(dto);
        return n > 0;
    }

    public MemberDto login(MemberDto dto) {
        return dao.login(dto);
    }
}
