package com.sagar.spring5recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by sagar on 12-10-2019
 */

@Controller
public class IndexController {
    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        System.out.println("say somthing...123499");
        return "index";
    }
}
