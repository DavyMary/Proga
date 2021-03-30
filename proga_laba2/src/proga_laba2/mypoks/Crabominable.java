package proga_laba2.mypoks;

import proga_laba2.moves.*;
import ru.ifmo.se.pokemon.Type;

public class Crabominable extends Crabrawler{

    public Crabominable(String name, int level){
        super(name,level);
        super.addType(Type.ICE);
        super.setStats(97,132,77,62,67,43);
        addMove(new IcePunch());
    }
}
