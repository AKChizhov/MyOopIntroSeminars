package Game.Heroes;

public class Crossbowman extends LongRange {
    protected int univer;

    public Crossbowman(String nameCharacter, String side, int xCoord, int yCoord, int univer) {
        super(nameCharacter, side, 4, xCoord, yCoord, 3, 10, 3, 6, 16);
        this.univer = univer;
    }

    @Override
    public String toString() {
        return "I'm a Crossbowman(арбалетчик) " + nameCharacter + " из Platoon " + side + " cо SPEED=" + speed
                + " и HP=" + healthPoints + " X= " + coord.x + " Y=" + coord.y;
    }

    @Override
    public void getInfo() {

    }

    @Override
    public String step() {
        System.out.println(toString());
        return ("");
    }
}
