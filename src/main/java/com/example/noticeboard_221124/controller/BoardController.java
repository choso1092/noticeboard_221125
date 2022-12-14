package com.example.noticeboard_221124.controller;

import com.example.noticeboard_221124.DTO.SearchBoardDTO;
import com.example.noticeboard_221124.service.BoardService;
import com.example.noticeboard_221124.vo.BoardVo;
import com.example.noticeboard_221124.vo.CommonResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping({"", "/"})
    public ModelAndView boardPage(String userId) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userId", userId);
        mv.setViewName("board/board");
        return mv;
    }

    @RequestMapping("/boardWrite")
    public ModelAndView createPage(String userId) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userId", userId);
        mv.setViewName("board/boardWrite");
        return mv;
    }

    @RequestMapping("/create")
    @ResponseBody
    public CommonResponseVo createBoard(BoardVo param) {
        CommonResponseVo r = new CommonResponseVo();
        try {
            boardService.createBord(param);
            r.setSuccess(true);
        } catch (Exception e) {
            System.out.println(e);
            r.setSuccess(false);
            r.setMessage(e.toString());
        }
        return r;
    }

    @RequestMapping("/getBoardList")
    @ResponseBody
    public CommonResponseVo viewBoard(SearchBoardDTO searchBoardDTO) {
        CommonResponseVo r = new CommonResponseVo();
        try {
            List<BoardVo> boardVList = boardService.getBoardList(searchBoardDTO);
            r.setSuccess(true);
            r.setData(boardVList);
        } catch (Exception e) {
            System.out.println(e);
            r.setSuccess(false);
            r.setMessage(e.toString());
        }
        return r;
    }

    @RequestMapping("/boardDetail")
    public ModelAndView boardViewDetail(String boardNumber, HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        try {
            BoardVo boardDetail = new BoardVo();
            /** Service 에 boardNumber 를 넘겨서 detail view 에 들어갈 detail data 를 꺼내와야 함 **/
            boardDetail = boardService.getBoardDetail(boardNumber);
            /**ModelAndView 에 Object 를 포함해서 가져오겠다.*/
            mv.addObject("boardDetail", boardDetail);
            mv.addObject("userId", session.getAttribute("userId"));
            /** jsp 에서 jstl 구문으로 불러와서 사용할 수 있음
             * Tag 라이브러리 를 사용해서 , <c:if></c:if> <c:forEach></c:forEach> <c:choose><c:when></c:when></c:choose> */
        } catch (Exception e) {
            System.out.println(e);
        }
        mv.setViewName("board/boardView");
        return mv;
    }
}