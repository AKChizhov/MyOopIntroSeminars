package Game.Heroes;

public class Robber extends Melee{

    public Robber(String nameCharacter, int strangulation) {
        super(nameCharacter, 30, 50, 30, 10, 10);
        
    }
    
    @Override
    public String toString(){
        return " I'm a Robber ( разбойник ) " + nameCharacter +" из "+getClass()+" c hashCode "+hashCode();
    }  
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
