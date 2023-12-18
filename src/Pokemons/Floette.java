package Pokemons;

import Moves.Physical.RazorLeaf;

public class Floette extends Flabebe{
    public Floette(String s, int i) {
        super(s, i);
        this.setStats(54,45,47,75,98,52);
        this.addMove(new RazorLeaf());
    }
}
