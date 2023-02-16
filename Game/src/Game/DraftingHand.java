package Game;

import java.util.ArrayList;
import Game.Heroes.*;

public class DraftingHand {

    static  ArrayList<BaseHero> ListOfSpecialties() {
        ArrayList<BaseHero> list1 = new ArrayList<>();
        
        list1.add (new Archer("Tom",30));
        list1.add (new Crossbowman("Rod",50));
        list1.add (new Mag("Duc",40));
        list1.add (new Monk("Adam",20));
        list1.add (new Peasant("Oscar",10));
        list1.add (new Pikeman("Derec",20));
        list1.add (new Robber("Harry",30));
        list1.add (new Sniper("Carl",50));
        
        System.out.println("");
        list1.forEach(n-> System.out.println(n.toString()));
        System.out.println("\n");
        return list1;
        }
    }
