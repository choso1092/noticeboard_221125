package com.example.noticeboard_221124.controller;

import com.example.noticeboard_221124.vo.BoardVo;
import com.example.noticeboard_221124.vo.CommonResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {

    @RequestMapping({"", "/"})
    public ModelAndView boardPage(String userId) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userId", userId);
        mv.setViewName("board/board");
        return mv;
    }
    @RequestMapping("/boardWrite")
    public ModelAndView createPage(String userID){
        ModelAndView mv = new ModelAndView();
        mv.addObject("userId", userID);
        mv.setViewName("board/boardWrite");
        return mv;
    }
    @RequestMapping("/create")
    @ResponseBody
    public CommonResponseVo createBoard(BoardVo param) {
        CommonResponseVo r = new CommonResponseVo();
        try {
            boardService.createBoard(param);
            r.setSuccess(true);
        } catch (Exception e) {
            System.out.println(e);
            r.setSuccess(false);
            r.setMessage(e.toString());
        }
        return r;
    }
}
