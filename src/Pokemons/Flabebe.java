package Pokemons;

import Moves.Status.CalmMind;
import Moves.Status.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Flabebe extends Pokemon {

    public Flabebe(String s, int i) {
        super(s, i);

        this.setType(Type.FAIRY);

        this.setStats(44,38,39,61,79,42);

        this.addMove(new CalmMind());
        this.addMove(new Swagger());
    }
}
