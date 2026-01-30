package com.example._9bridge;

public abstract class Character {

    protected Ability ability;

    public Character(Ability ability) {
        this.ability = ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public abstract void performAbility();

}
