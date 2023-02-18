package Game.Heroes;

public class Peasant extends BaseHero{

    public Peasant(String nameCharacter,String side, int multArmor) {
        super(nameCharacter,side,3,  20, 100, 100, 20);
        
    }

    @Override
    public String toString(){
        return " I'm a Peasant (крестьянин) " + nameCharacter + " из PLATOON "+side+" cо SPEED "+speed+" и HP "+healthPoints;
    }  
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
