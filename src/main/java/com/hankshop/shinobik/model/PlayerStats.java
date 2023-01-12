package com.hankshop.shinobik.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "player_stats")
public class PlayerStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "level")
    private Long level;

    @Column(name = "experience")
    private Long experience;

    @Column(name = "health_point")
    private Long healthPoint;

    @Column(name = "acuity")
    private Long acuity;

    @Column(name = "sanity")
    private Long sanity;

    @Column(name = "pressure")
    private Long pressure;

    @Column(name = "physique")
    private Long physique;

    @Column(name = "mentality")
    private String mentality;


    public String getMentality() {
        return mentality;
    }

    public void setMentality(String mentality) {
        this.mentality = mentality;
    }

    public Long getPhysique() {
        return physique;
    }

    public void setPhysique(Long physique) {
        this.physique = physique;
    }

    public Long getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Long healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Long getPressure() {
        return pressure;
    }

    public void setPressure(Long pressure) {
        this.pressure = pressure;
    }

    public Long getSanity() {
        return sanity;
    }

    public void setSanity(Long sanity) {
        this.sanity = sanity;
    }

    public Long getAcuity() {
        return acuity;
    }

    public void setAcuity(Long acuity) {
        this.acuity = acuity;
    }

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }
}