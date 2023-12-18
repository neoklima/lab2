package Moves.Physical;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class Bite extends PhysicalMove {
    //Bite deals damage and has a 30% chance of causing the target to flinch

    public Bite() {
        super(Type.DARK,60,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        //так реализован шанс 30% на наложение эффекта
        Random r = new Random();
        if (r.nextInt(100)<=30){
            Effect.flinch(pokemon);
        }
    }
}
