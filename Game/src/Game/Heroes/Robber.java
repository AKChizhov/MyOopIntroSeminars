package Game.Heroes;

public class Robber extends Melee{

    public Robber(String nameCharacter, int strangulation) {
        super(nameCharacter,6, 30, 50, 30, 10, 10);
        
    }
    
    @Override
    public String toString(){
        return " I'm a Robber (разбойник) " + nameCharacter +" из "+getClass()+" cо speed "+speed+" и hP "+healthPoints;
    }  
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
