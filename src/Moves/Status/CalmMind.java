package Moves.Status;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {
    //Calm Mind raises the user's Special Attack and Special Defense by one stage each.
    public CalmMind() {
        super(Type.PSYCHIC,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        //повышает  модификатор атаки и спец атаки на 1
        pokemon.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK,1).stat(Stat.SPECIAL_DEFENSE,1));
    }

}
