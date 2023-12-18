package Pokemons;

import Moves.Status.Confide;

public class Florges extends Floette{
    public Florges(String s, int i) {
        super(s, i);
        this.setStats(78,65,68,112,154,75);
        this.addMove(new Confide());
    }
}
