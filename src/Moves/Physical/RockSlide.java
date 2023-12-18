package Moves.Physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class RockSlide extends PhysicalMove {
    //Rock Slide deals damage and has a 30% chance of causing the target to flinch
    public RockSlide() {
        super(Type.ROCK,75,90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Random r = new Random();
        if (r.nextInt(100)<=30){
            Effect.flinch(pokemon);
        }
    }
}
