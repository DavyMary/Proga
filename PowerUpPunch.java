package proga_laba2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class PowerUpPunch extends PhysicalMove {
    public PowerUpPunch() {
        super(Type.FIGHTING, 40, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {

        super.applyOppDamage(def, damage);
    }
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +1);
    }

    @Override
    protected String describe() {
        return "использует Power-Up Punch";
    }
}
