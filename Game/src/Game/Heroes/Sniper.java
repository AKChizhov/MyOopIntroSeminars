package Game.Heroes;

public class Sniper extends LongRange {

    public Sniper(String nameCharacter, int disguise ) {
        super(nameCharacter, 9, 100,  50, 10, 0, 50);
        
    }
    
    @Override
    public String toString(){
        return " I'm a Sniper (снайпер) " + nameCharacter +" из "+getClass()+" cо speed "+speed+" и hP "+healthPoints;
    } 
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
