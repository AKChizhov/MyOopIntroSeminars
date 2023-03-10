package Game.Heroes;

public class Robber extends Melee {
    protected int strangulation;

    public Robber(String nameCharacter, String side, int xCoord, int yCoord, int strangulation) {
        super(nameCharacter, side, 6, xCoord, yCoord, 3, 10, 3, 8, 0);
        this.strangulation = strangulation;
    }

    @Override
    public String toString() {
        return "I'm a Robber(разбойник) " + nameCharacter + " из PLATOON " + side + " cо SPEED=" + speed + " и HP="
                + healthPoints + "X=" + coord.x + "Y=" + coord.y;
    }

    @Override
    public void getInfo() {

    }

    @Override
    public String step() {

        return ("");
    }
}
