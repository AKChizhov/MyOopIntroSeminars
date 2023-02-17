package Game.Heroes;

import Game.interFaceGame;

public abstract class BaseHero implements interFaceGame{
    
    protected String nameCharacter;
    protected int speed;
    protected int damage;
    protected int healthPoints;
    protected int defence;
    protected int evolution;

    public BaseHero(String nameCharacter,int speed, int damage ,int healthPoints,int defence,int evolution ) {
        this.nameCharacter = nameCharacter;
        this.speed = speed;
        this.damage = damage;
        this.healthPoints = healthPoints;
        this.defence = defence;
        this.evolution = evolution;

        }

        public int Endurance(int damage ){    
            healthPoints = healthPoints + defence - damage;
            return healthPoints;
        }   
        
        public int StrikeLong( int accuracy, int multy, int univer){
            damage = damage + multy + univer;
            return damage;
        }

        public int getSpeed() {
            return speed;
        }

}
