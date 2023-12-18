import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon stantler = new Stantler("Сохатый",1);
        Pokemon panpour = new Panpour("Макака",1);
        Pokemon simipour = new Simipour("Горилла",1);
        Pokemon flabebe = new Flabebe("Цветочек",1);
        Pokemon floette = new Floette("Цветок",1);
        Pokemon florges = new Florges("Цветище",1);

        b.addFoe(stantler);
        b.addFoe(panpour);
        b.addFoe(simipour);

        b.addAlly(flabebe);
        b.addAlly(floette);
        b.addAlly(florges);

        b.go();
    }
}