package Moves.Physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

import java.lang.reflect.Constructor;
import java.util.concurrent.locks.Condition;

public class Facade extends PhysicalMove {
    //Facade deals damage, and hits with double power (140) if the user is burned, poisoned or paralyzed. 

    //если user - не противник, то особенность атаки нереализуема, то есть оставляем только конструктор
    //Эта атака наносит 140 урона вместо 70 (в два раза больше) в случае если противник в состоянии BURN/PARALYZE/POISON
    public Facade() {
        super(Type.NORMAL,70,100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (pokemon.getCondition().equals(Status.BURN)||
                pokemon.getCondition().equals(Status.PARALYZE)||
                pokemon.getCondition().equals(Status.POISON)){
            super.applyOppDamage(pokemon, v*2);
        }
        else {
            super.applyOppDamage(pokemon, v);
        }
    }
}
