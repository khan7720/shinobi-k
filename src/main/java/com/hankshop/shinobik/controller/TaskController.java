package com.hankshop.shinobik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    @GetMapping
    public String getIndexList(){
        return null;
    }

}
