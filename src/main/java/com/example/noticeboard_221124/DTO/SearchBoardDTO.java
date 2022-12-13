package com.example.noticeboard_221124.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchBoardDTO {
    private String searchKey;
    private String searchValue;

}
