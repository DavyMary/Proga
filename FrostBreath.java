package proga_laba2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FrostBreath extends SpecialMove {
    public FrostBreath(){
        super(Type.ICE, 60, 90);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage*1.3);
    }

    @Override
    protected String describe() {
        return "использует Frost Breath";
    }
}
