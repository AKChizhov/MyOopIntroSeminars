package Game.Heroes;

public class Mag extends Mental {
    protected int slowdown;

    public Mag(String nameCharacter, String side, int xCoord, int yCoord, int slowdown) {
        super(nameCharacter, side, 9, xCoord, yCoord, 5, 30, 12, 17, 1);
        this.slowdown = slowdown;
    }

    @Override
    public String toString() {
        return "I'm a Mag(маг) " + nameCharacter + " из PLATOON " + side + " cо SPEED=" + speed + " и HP="
                + healthPoints + " X=" + coord.x + " Y=" + coord.y;
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
