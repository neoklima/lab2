package Pokemons;

import Moves.Physical.Bite;
import Moves.Physical.Facade;
import Moves.Physical.WildCharge;
import Moves.Special.DreamEater;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Stantler extends Pokemon {

    public Stantler(String s, int i) {
        super(s, i);
        this.setStats(73,95,62,85,65,65);
        this.setType(Type.NORMAL);

        this.addMove(new WildCharge());
        this.addMove(new Facade());
        this.addMove(new DreamEater());
        this.addMove(new Bite());
    }
}
