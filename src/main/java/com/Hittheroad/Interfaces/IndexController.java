package com.Hittheroad.Interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "hittheroad/index";
    }//홈

    @GetMapping("/login")
    public String login(){return "hittheroad/login";}//로그인 화면

    @GetMapping("sign_in")
    public String signIn(){return "hittheroad/sign_in";} //회원 가입

    @GetMapping("sign_up")
    public String signUp(){return "hittheroad/sign_up";}//로그인 시도
}
