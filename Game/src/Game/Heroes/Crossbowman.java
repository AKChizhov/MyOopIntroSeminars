package Game.Heroes;

public class Crossbowman extends LongRange{

    public Crossbowman(String nameCharacter, int univer) {
        super(nameCharacter, 40, 50, 30, 10, 60);
        
    }
    
    @Override
    public String toString(){
        return " I'm a Crossbowman (стрелок-арбалетчик ) " + nameCharacter+ " из "+getClass()+" c hashCode "+hashCode();
    }     
}
