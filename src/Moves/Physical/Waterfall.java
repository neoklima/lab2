package Moves.Physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class Waterfall extends PhysicalMove {
    //Waterfall deals damage and has a 20% chance of causing the target to flinch


    public Waterfall() {
        super(Type.WATER,80,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        //Есть 20% шанс наложения эффекта flinch
        if (new Random().nextInt(100) <= 20) {
            Effect.flinch(pokemon);
        }
    }
}
