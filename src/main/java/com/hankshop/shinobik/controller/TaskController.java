package com.hankshop.shinobik.controller;

import com.hankshop.shinobik.model.ToCheck;
import com.hankshop.shinobik.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public String getTaskPage(Model model){
        List<ToCheck> toChecks = taskService.listAllToCheck();
        model.addAttribute("toChecks",toChecks);
        return "task";
    }

    @PostMapping("task/toCheck")
    public ToCheck saveToCheck(@RequestBody ToCheck toCheck){
        return taskService.saveToCheck(toCheck);
    }

    @GetMapping("task/toCheck/{id}")
    public ToCheck findToCheckById(@PathVariable Long id){
        return taskService.findToCheckById(id);
    }

}
