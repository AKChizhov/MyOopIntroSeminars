package Game.Heroes;

import java.net.CookieHandler;
import java.util.ArrayList;

import Game.interFaceGame;

public abstract class BaseHero implements interFaceGame{
    
    protected String nameCharacter;
    protected String side;
    protected int speed;
    protected int damage;
    protected int healthPoints;
    protected int defence;
    protected int attack;
    protected PointIntheField coord;
    protected ArrayList<BaseHero> warriers;
    

    public BaseHero(String nameCharacter,String side,int speed,int xCoord,int yCoord, int damage ,int healthPoints,int defence,int attack ) {
        this.nameCharacter = nameCharacter;
        this.side = side;
        this.speed = speed;
        this.damage = damage;
        this.healthPoints = healthPoints;
        this.defence = defence;
        this.attack = attack;
        coord = new PointIntheField(xCoord, yCoord);


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

        public int gethealthPoints() {
            return healthPoints;
        }

        public void setWarries(ArrayList<BaseHero> warriers){

            this.warriers = warriers;

        }

}
