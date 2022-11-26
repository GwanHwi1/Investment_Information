package com.example.investment_information.dao;


import com.example.investment_information.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberDao {

    int getId(MemberDto dto);
    int addMember(MemberDto dto);
    MemberDto login(MemberDto dto);
}
