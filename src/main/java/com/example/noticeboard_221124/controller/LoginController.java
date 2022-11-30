package com.example.noticeboard_221124.controller;

import com.example.noticeboard_221124.service.UserService;
import com.example.noticeboard_221124.vo.CommonResponseVo;
import com.example.noticeboard_221124.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    public UserService userService;

    //메인 화면 URL
    @RequestMapping({"/", "login"})
    public ModelAndView loginPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login/login");
        return mv;
    }

    //로그인 테스트 URL
    @RequestMapping("/loginTest")
    @ResponseBody
    public CommonResponseVo loginProcess(UserVo param) {
        CommonResponseVo result = new CommonResponseVo();
        try {
            Boolean r = userService.loginProcess(param);
            result.setSuccess(r);

        } catch (Exception e) {
            System.out.println(e);
            result.setSuccess(false);
        }
        return result;
    }

    //회원가입 페이지 URL
    @RequestMapping("/join")
    public ModelAndView joinPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login/join");
        return mv;
    }

    @RequestMapping("/signUp")
    @ResponseBody
    public CommonResponseVo signUpUser(UserVo param) {
        /**1. 회원가입이 잘되었는 지 확인하고 싶다.
         * 2. 회원가입 -> DB 저장 을 하고싶다. **/
        CommonResponseVo r = new CommonResponseVo();
        try {
            userService.joinUser(param);
            r.setSuccess(true);

        } catch (Exception e) {
            r.setSuccess(false);
            r.setMessage(e.toString());
        }
        return r;
    }
}
