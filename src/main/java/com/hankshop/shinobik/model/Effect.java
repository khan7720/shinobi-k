package com.hankshop.shinobik.model;

import javax.persistence.*;

@Entity
@Table(name = "effect")
public class Effect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "effect_name")
    private String effectName;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "magic_spell")
    private String magicSpell;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMagicSpell() {
        return magicSpell;
    }

    public void setMagicSpell(String magicSpell) {
        this.magicSpell = magicSpell;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEffectName() {
        return effectName;
    }

    public void setEffectName(String effectName) {
        this.effectName = effectName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}