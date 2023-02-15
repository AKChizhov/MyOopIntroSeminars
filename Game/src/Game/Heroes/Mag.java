package Game.Heroes;

public class Mag extends Mental {

    public Mag(String nameCharacter, int slowdown) {
        super(nameCharacter, 50, 60, 70, 5, 30);
        
    }
    
    @Override
    public String toString(){
        return " I'm a Mag ( маг ) " + nameCharacter + " из "+getClass()+" c hashCode "+hashCode();
    }     
}
