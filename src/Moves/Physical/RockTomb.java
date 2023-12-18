package Moves.Physical;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    //Rock Tomb deals damage and lowers the target's Speed by one stage.
    public RockTomb() {
        super(Type.ROCK,60,95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        pokemon.addEffect(new Effect().stat(Stat.SPEED,-1));
    }
}
