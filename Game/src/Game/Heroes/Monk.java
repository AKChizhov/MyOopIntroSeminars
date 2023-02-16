package Game.Heroes;

public class Monk extends Mental{

    public Monk(String nameCharacter, int acceleration) {
        super(nameCharacter, 40, 100 , 60, 10, 20);
        
    }
    
    @Override
    public String toString(){
        return " I'm a Monk ( монах ) " + nameCharacter +" из "+getClass()+" c hashCode "+hashCode();
    }   
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
