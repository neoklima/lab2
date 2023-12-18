package Moves.Special;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    //Dream Eater deals damage only on sleeping foes and the user will recover 50% of the HP drained.
    //Наносит урон только если покемон спит
    //Востанавливает 50% потраченных хп

    public DreamEater() {
        super(Type.PSYCHIC,100,100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (pokemon.getCondition().equals(Status.SLEEP)){
            super.applyOppDamage(pokemon,v);
        }
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {

        pokemon.setMod(Stat.HP, (int) ((pokemon.getStat(Stat.HP)-pokemon.getHP())*0.5));
        super.applySelfEffects(pokemon);
    }
}
