package proga_laba2.mypoks;

import proga_laba2.moves.*;

public class Gloom extends Oddish{
    public Gloom(String name, int level){
        super(name,level);
        super.setStats(60,65,70,85,75,40);
        addMove(new Growth());
    }
}