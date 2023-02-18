package Game.Heroes;

public class Sniper extends LongRange {

    public Sniper(String nameCharacter,String side, int disguise ) {
        super(nameCharacter,side, 9, 100,  50, 10, 0, 50);
        
    }
    
    @Override
    public String toString(){
        return " I'm a Sniper (снайпер) " + nameCharacter +" из PLATOON "+side+" cо SPEED "+speed+" и HP "+healthPoints;
    } 
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
