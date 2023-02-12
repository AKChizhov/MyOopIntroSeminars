package Game.Heroes;

public abstract class BaseHero {
    
    protected String nameCharacter;
    protected int damage;
    protected int healthPoints;
    protected int defence;
    protected int evolution;

    public BaseHero(String nameCharacter,int damage,int healthPoints,int defence,int evolution) {
        this.nameCharacter = nameCharacter;
        this.damage = damage;
        this.healthPoints = healthPoints;
        this.defence = defence;
        this.evolution = evolution;

        }

}
