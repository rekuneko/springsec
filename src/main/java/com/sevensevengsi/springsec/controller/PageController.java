package com.sevensevengsi.springsec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @GetMapping("/all")
    public String forAll(){
        return "forAll/page1";
    }

    @GetMapping("/manager")
    public String forManager(){
        return "forAuthenticated/page2";
    }

    @GetMapping("/admin")
    public String forAdmin(){
        return "forAuthenticated/page3";
    }

    @GetMapping("/lender")
    public String forLender(){
        return "forAuthenticated/page4";
    }

    @GetMapping("/borrower")
    public String forBorrower(){
        return "forAuthenticated/page5";
    }

}
