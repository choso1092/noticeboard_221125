package com.example.noticeboard_221124.service;

import com.example.noticeboard_221124.DTO.SearchBoardDTO;
import com.example.noticeboard_221124.mapper.BoardMapper;
import com.example.noticeboard_221124.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    @Autowired
    BoardMapper boardMapper;

    public void createBord(BoardVo boardVo) {boardMapper.createBoard(boardVo);}

    public List<BoardVo> getBoardList(SearchBoardDTO searchBoardDTO){
        return boardMapper.viewList(searchBoardDTO);
    }
    public BoardVo getBoardDetail(String boardNumber){return boardMapper.getBoardDetail(boardNumber);}

}
