package Game.Heroes;

public class Peasant extends BaseHero{

    public Peasant(String nameCharacter, int multArmor) {
        super(nameCharacter,3,  20, 100, 100, 20);
        
    }

    @Override
    public String toString(){
        return " I'm a Peasant ( крестьянин ) " + nameCharacter + " из "+getClass()+" cо speed "+speed+" и hP "+healthPoints;
    }  
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
