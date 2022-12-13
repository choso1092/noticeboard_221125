package com.example.noticeboard_221124.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardVo {

    private int boardNumber;
    private String userId;
    private String title;
    private String content;
    private String boardTime;
    private int num;

}
