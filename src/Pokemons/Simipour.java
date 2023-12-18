package Pokemons;

import Moves.Physical.RockSlide;

public class Simipour extends Panpour{

    public Simipour(String s, int i) {
        super(s, i);
        this.setStats(75,98,63,98,63,101);
        this.addMove(new RockSlide());
    }
}
