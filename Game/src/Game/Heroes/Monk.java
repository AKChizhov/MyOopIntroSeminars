package Game.Heroes;

public class Monk extends Mental{
    protected int acceleration;

    public Monk(String nameCharacter,String side,int xCoord,int yCoord, int acceleration) {
        super(nameCharacter,side,5,xCoord,yCoord, 4, 30 , 7, 12, 1);
        this.acceleration = acceleration;
    }
    
    @Override
    public String toString(){
        return " I'm a Monk (монах) " + nameCharacter +" из PLATOON "+side+" cо SPEED "+speed+" и HP "+healthPoints;
    }   
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
