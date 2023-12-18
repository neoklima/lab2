package Moves.Physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class WildCharge extends PhysicalMove {
//Wild Charge deals damage, but the user receives 1⁄4 of the damage it inflicted in recoil. In other words, if the attack does 100 HP damage to the opponent, the user will lose 25 HP.
//Атака наносит урон в размере 25% урона от урона противника атакующему
    public WildCharge() {
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        super.applySelfDamage(pokemon, v * 0.25);
    }
}
