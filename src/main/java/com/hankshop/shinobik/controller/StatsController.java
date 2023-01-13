package com.hankshop.shinobik.controller;

import com.hankshop.shinobik.model.PlayerStats;
import com.hankshop.shinobik.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class StatsController {

    @Autowired
    private StatsService statsService;

    @GetMapping
    public PlayerStats getPlayerStats(){
        return statsService.getPlayerStats();
    }
}
