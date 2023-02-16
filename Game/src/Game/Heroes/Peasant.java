package Game.Heroes;

public class Peasant extends BaseHero{

    public Peasant(String nameCharacter, int multArmor) {
        super(nameCharacter,  20, 100, 100, 20);
        
    }

    @Override
    public String toString(){
        return " I'm a Peasant ( крестьянин ) " + nameCharacter + " из "+getClass()+" c hashCode "+hashCode();
    }  
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
