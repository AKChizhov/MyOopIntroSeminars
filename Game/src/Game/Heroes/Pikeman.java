package Game.Heroes;

public class Pikeman extends Melee{

    public Pikeman(String nameCharacter,String side, int poison) {
        super(nameCharacter,side,4, 40, 100, 50, 10,10);

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
