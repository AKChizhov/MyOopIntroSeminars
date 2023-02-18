package Game.Heroes;

public class Pikeman extends Melee{

    public Pikeman(String nameCharacter, int poison) {
        super(nameCharacter,4, 40, 100, 50, 10,10);

    }
    
    @Override
    public String toString(){
        return " I'm a Pikeman ( копейщик ) " + nameCharacter + " из "+getClass()+" c hashCode "+hashCode();
    } 
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
