package com.example.noticeboard_221124.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponseVo {

    private String message;
    private Boolean success =false;
    private Object data;
}
