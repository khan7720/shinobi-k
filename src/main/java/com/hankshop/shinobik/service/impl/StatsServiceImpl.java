package com.hankshop.shinobik.service.impl;

import com.hankshop.shinobik.Repository.PlayerStatsRepository;
import com.hankshop.shinobik.model.PlayerStats;
import com.hankshop.shinobik.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StatsServiceImpl implements StatsService {

    @Autowired
    private PlayerStatsRepository playerStatsRepository;

    @Override
    public PlayerStats getPlayerStats() {
        Optional<PlayerStats> stats = playerStatsRepository.findById(1);
        if (stats.isPresent()) {
            return stats.get();
        } else {
            throw new NoSuchElementException();
        }
    }
}
