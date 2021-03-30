package proga_laba2.mypoks;

import proga_laba2.moves.EnergyBall;

public class Vileplume extends Gloom{
    public Vileplume(String name, int level){
        super(name,level);
        super.setStats(75,80,85,110,90,50);
        addMove(new EnergyBall());
    }
}
