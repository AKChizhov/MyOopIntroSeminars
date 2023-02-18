package Game.Heroes;

public class Crossbowman extends LongRange{

    public Crossbowman(String nameCharacter, int univer) {
        super(nameCharacter,4, 40, 50, 30, 10, 60);
        
    }
    
    @Override
    public String toString(){
        return " I'm a Crossbowman (арбалетчик) " + nameCharacter+ " из "+getClass()+" cо speed "+speed+" и hP "+healthPoints;
    }   
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
