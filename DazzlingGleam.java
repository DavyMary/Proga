package proga_laba2.moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam(){
        super(Type.FAIRY, 80, 100);
    }
    @Override
    protected String describe() {
        return "использует Dazzling Gleam";
    }
}
