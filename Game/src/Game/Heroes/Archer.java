package Game.Heroes;

public class Archer extends LongRange{

    private int multyS;
    
    public Archer(String nameCharacter,String side, int multyS) {
        super(nameCharacter,side,10, 50, 100, 20, 10, 10);
        this.multyS = multyS;
        super.damage = 30;
    }

    public int getMultys(){
        return multyS;
    }

    @Override
    public String toString(){
        //return " I'm a Archer (стрелок-лучник) "+nameCharacter +" из "+getClass()+" c hashCode "+hashCode();
        return " I'm a Archer (лучник) "+nameCharacter +" из PLATOON "+side+" cо SPEED "+speed+" и HP "+healthPoints;
    }    
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }


}
