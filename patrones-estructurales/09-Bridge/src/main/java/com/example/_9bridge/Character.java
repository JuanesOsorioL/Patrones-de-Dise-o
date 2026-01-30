package com.example._9bridge;

import com.example._9bridge.habilidades.base.Ability;
import lombok.Setter;

@Setter
public abstract class Character {

    protected Ability ability;

    protected Character(Ability ability) {
        this.ability = ability;
    }

/*    public void setAbility(Ability ability) {
        this.ability = ability;
    }*/

    public abstract void performAbility();

}
