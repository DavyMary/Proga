package proga_laba2.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class IcePunch extends PhysicalMove {
    public IcePunch() {
        super(Type.ICE, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() < 0.1) {
            Effect.freeze(p);
        }
    }
    @Override
    protected String describe() {
        return "использует Ice Punch";
    }
}
