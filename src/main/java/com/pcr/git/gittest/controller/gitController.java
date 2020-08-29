package com.pcr.git.gittest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gitController {

    @RequestMapping("/git_test")
    public String gitTest(){
        return "git test is successful!";
    }
}
