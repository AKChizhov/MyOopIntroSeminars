package Game.Heroes;

public class Mag extends Mental {

    public Mag(String nameCharacter,String side, int slowdown) {
        super(nameCharacter,side,9, 50, 60, 70, 5, 30);
        
    }
    
    @Override
    public String toString(){
        return " I'm a Mag (маг) " + nameCharacter + " из PLATOON "+side+" cо SPEED "+speed+" и HP "+healthPoints;
    } 
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
