package Game.Heroes;

public abstract class Mental extends BaseHero{
    protected int healing;
    public Mental(String nameCharacter,String side,int speed,int xCoord,int yCoord, int damage, int healthPoints, int defence, int attack,int healing) {
        super(nameCharacter,side,speed,xCoord,yCoord, damage, healthPoints, defence, attack);
        this.healing = healing;
    }
    
}

