package Moves.Physical;

import ru.ifmo.se.pokemon.*;


public class RazorLeaf extends PhysicalMove {
   // Razor Leaf deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄24).
    //Чтобы выполнить это надо переписать calcCriticalHit, но переписать его нельзя
    //тк внутри метода calcCriticalHit используется класс Messages, а он не публичный
    public RazorLeaf() {
        super(Type.GRASS,55,95);
    }


}
