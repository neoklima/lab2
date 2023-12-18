package Pokemons;

import Moves.Physical.RockTomb;
import Moves.Physical.Waterfall;
import Moves.Special.Blizzard;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Panpour extends Pokemon {

    public Panpour(String s, int i) {
        super(s, i);
        this.setStats(50,53,48,53,48,64);

        this.setType(Type.WATER);

        this.addMove(new Blizzard());
        this.addMove(new RockTomb());
        this.addMove(new Waterfall());
    }
}
