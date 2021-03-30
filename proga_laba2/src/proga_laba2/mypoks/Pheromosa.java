package proga_laba2.mypoks;

import proga_laba2.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pheromosa extends Pokemon {
    public Pheromosa(String name, int level){
        super(name,level);
        super.setType(Type.BUG, Type.FIGHTING);
        super.setStats(71,137,37,137,37,151);
        setMove(new Bulldoze(), new PowerUpPunch(), new RockTomb(), new Lunge());
    }

}
