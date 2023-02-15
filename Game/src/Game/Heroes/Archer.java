package Game.Heroes;

public class Archer extends LongRange{

    private int multyS;
    
    public Archer(String nameCharacter, int multyS) {
        super(nameCharacter, 50, 100, 20, 10, 10);
        this.multyS = multyS;
        super.damage = 30;
    }

    public int getMultys(){
        return multyS;
    }

    @Override
    public String toString(){
        return " I'm a Archer (стрелок-лучник) "+nameCharacter +" из "+getClass()+" c hashCode "+hashCode();
    }     
}
