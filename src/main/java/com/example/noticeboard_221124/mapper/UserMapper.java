package com.example.noticeboard_221124.mapper;

import com.example.noticeboard_221124.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    Integer isLoginAble(UserVo param);
    Integer duplicateUserByUserId(String userId); // 유저 중복체크
    int joinUser(UserVo param);
}
