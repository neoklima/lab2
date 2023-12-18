package Moves.Special;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    //Blizzard deals damage and has a 10% chance of freezing the target
    public Blizzard() {
        super(Type.ICE,110,70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        // тк стандартными методами доступа к сокомандникам нет, то фишка с заморозкой крайних - нереализуема
        pokemon.addEffect(new Effect().condition(Status.FREEZE).chance(0.10));
    }
}
