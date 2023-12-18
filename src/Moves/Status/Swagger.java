package Moves.Status;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    //Swagger confuses the target and raises its Attack by two stages.
    public Swagger() {
        super(Type.NORMAL,0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
        pokemon.addEffect(new Effect().stat(Stat.ATTACK,2));
    }
}
