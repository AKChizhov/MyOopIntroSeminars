package Game.Heroes;

public class Robber extends Melee{

    public Robber(String nameCharacter,String side, int strangulation) {
        super(nameCharacter,side,6, 30, 50, 30, 10, 10);
        
    }
    
    @Override
    public String toString(){
        return " I'm a Robber (разбойник) " + nameCharacter +" из PLATOON "+side+" cо SPEED "+speed+" и HP "+healthPoints;
    }  
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
