package Game.Heroes;

public class Mag extends Mental {

    public Mag(String nameCharacter, int slowdown) {
        super(nameCharacter,18, 50, 60, 70, 5, 30);
        
    }
    
    @Override
    public String toString(){
        return " I'm a Mag ( маг ) " + nameCharacter + " из "+getClass()+" c hashCode "+hashCode();
    } 
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
