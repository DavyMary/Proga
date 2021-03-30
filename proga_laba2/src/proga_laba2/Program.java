package proga_laba2;

import proga_laba2.mypoks.*;
import ru.ifmo.se.pokemon.Battle;

public class Program {
    public static void main(String[] args){

        Battle b = new Battle();

        Pheromosa p1 = new Pheromosa("Палец", 1);
        Crabrawler p2 = new Crabrawler("Локоть", 1);
        Crabominable p3 = new Crabominable("Плечо", 1);
        Oddish p4 = new Oddish("Коленка", 1);
        Gloom p5 = new Gloom("Ступня", 1);
        Vileplume p6 = new Vileplume("Пятка", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
