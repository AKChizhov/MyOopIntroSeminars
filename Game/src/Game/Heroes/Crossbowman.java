package Game.Heroes;

public class Crossbowman extends LongRange{

    public Crossbowman(String nameCharacter,String side, int univer) {
        super(nameCharacter,side,4, 40, 50, 30, 10, 60);
        
    }
    
    @Override
    public String toString(){
        return " I'm a Crossbowman (арбалетчик) " + nameCharacter+ " из Platoon "+side+" cо SPEED "+speed+" и HP "+healthPoints;
    }   
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
