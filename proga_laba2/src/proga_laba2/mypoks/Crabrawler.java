package proga_laba2.mypoks;

import proga_laba2.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Crabrawler extends Pokemon {
    public Crabrawler(String name, int level){
        super(name,level);
        super.setType(Type.FIGHTING);
        super.setStats(47,82,57,42,47,63);
        setMove(new FrostBreath(), new Confide(), new Bubble());
    }

}
