package Game.Heroes;

public class Sniper extends LongRange {

    public Sniper(String nameCharacter, int disguise ) {
        super(nameCharacter, 5, 100,  50, 10, 0, 50);
        
    }
    
    @Override
    public String toString(){
        return " I'm a Sniper (стрелок-снайпер ) " + nameCharacter +" из "+getClass()+" c hashCode "+hashCode();
    } 
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
