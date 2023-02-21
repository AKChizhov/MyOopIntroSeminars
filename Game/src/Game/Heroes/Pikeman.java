package Game.Heroes;

public class Pikeman extends Melee{
    protected int poison;

    public Pikeman(String nameCharacter,String side,int xCoord,int yCoord, int poison) {
        super(nameCharacter,side,4,xCoord,yCoord, 2, 10, 5, 4,10);
        this.poison = poison;
    }
    
    @Override
    public String toString(){
        return " I'm a Pikeman (копейщик) " + nameCharacter + " из PLATOON "+side+" cо SPEED "+speed+" и HP "+healthPoints;
    } 
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
