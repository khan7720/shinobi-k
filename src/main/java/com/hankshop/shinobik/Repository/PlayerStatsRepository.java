package com.hankshop.shinobik.Repository;

import com.hankshop.shinobik.model.PlayerStats;
import org.springframework.data.repository.CrudRepository;

public interface PlayerStatsRepository extends CrudRepository<PlayerStats, Integer> {
}