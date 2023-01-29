package com.hankshop.shinobik.controller;

import com.hankshop.shinobik.model.PlayerStats;
import com.hankshop.shinobik.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/stats")
public class StatsController {

    @Autowired
    private StatsService statsService;

    @GetMapping
    public String getFmStats(ModelMap modelMap){
        Map<String,String> statsMap = new HashMap<>();
        PlayerStats stats = statsService.getPlayerStats();
        statsMap.put("level", String.valueOf(stats.getLevel()));
        statsMap.put("experience", String.valueOf(stats.getExperience()));
        statsMap.put("healthPoint", String.valueOf(stats.getHealthPoint()));
        statsMap.put("acuity", String.valueOf(stats.getAcuity()));
        statsMap.put("sanity", String.valueOf(stats.getSanity()));
        statsMap.put("pressure", String.valueOf(stats.getPressure()));
        statsMap.put("physique", String.valueOf(stats.getPhysique()));
        statsMap.put("mentality", stats.getMentality());

        modelMap.addAttribute("stats",statsMap);
        return "index";
    }
}
