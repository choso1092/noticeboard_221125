package com.example.noticeboard_221124.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {

    private String userId;
    private String userPassword;
    private String userName;
    private String phoneNumber;

}
