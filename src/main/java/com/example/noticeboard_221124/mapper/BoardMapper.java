package com.example.noticeboard_221124.mapper;

import com.example.noticeboard_221124.DTO.SearchBoardDTO;
import com.example.noticeboard_221124.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper   {

    void createBoard(BoardVo param);

    List<BoardVo> viewList(SearchBoardDTO searchBoardDTO);

    BoardVo getBoardDetail(String boardNumber);

}
