package Game.Heroes;

public class Monk extends Mental{

    public Monk(String nameCharacter,String side, int acceleration) {
        super(nameCharacter,side,5, 40, 100 , 60, 10, 20);
        
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
