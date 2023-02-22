package Game.Heroes;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class Archer extends LongRange {

    private int multyS;
    

    public Archer(String nameCharacter, String side, int xCoord, int yCoord, int multyS) {
        super(nameCharacter, side, 10, xCoord, yCoord, 6, 13, 20, 9, 48);
        this.multyS = multyS;
       
    }

    public int getMultys() {
        return multyS;
    }

    @Override
    public String toString() {
        return "I'm a Archer(лучник) " + nameCharacter + " из PLATOON " + side + " cо SPEED=" + speed + " и HP="
                + healthPoints + " X=" + coord.x + " Y=" + coord.y;
    }

    @Override
    public void getInfo() {

    }

    @Override
    public String step() {
     
        System.out.println(toString());
        
        System.out.print(side+".........\n");
        
        return ("");
    }

}
