package proga_laba2.moves;

import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove {
    public Bubble(){
        super(Type.WATER, 40, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if (Math.random() < 0.1) {
            def.setMod(Stat.SPEED, -1);
        }
        super.applyOppDamage(def, damage);
    }

    @Override
    protected String describe() {
        return "использует Bubble";
    }
}
