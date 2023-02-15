package Game;
import java.util.ArrayList;
import Game.Heroes.*;
/* 
import Game.Heroes.Archer;
import Game.Heroes.BaseHero;
import Game.Heroes.Crossbowman;
import Game.Heroes.Mag;
import Game.Heroes.Monk;
import Game.Heroes.Peasant;
import Game.Heroes.Pikeman;
import Game.Heroes.Robber;
import Game.Heroes.Sniper;
*/

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, My Game !");

        Peasant Tom = new Peasant("Tom", 0);
        System.out.println(Tom.Endurance( 20));

        Archer Tim = new Archer("Tim", 50);
        System.out.println(Tim.StrikeLong(0, 20, 0));

        Robber Bill = new Robber("Bill", 40);
        Pikeman Rod = new Pikeman("Rod", 20);
        Crossbowman Mike = new Crossbowman("Mike", 10);
        Sniper Bom = new Sniper("Bom", 50);
        Monk John = new Monk("John", 10);
        Mag Raul = new Mag("Raul", 20);

        ArrayList<BaseHero> list = new ArrayList<>();
        list.add(Tim);list.add(Tom);list.add(Bill);list.add(Rod);list.add(Mike);list.add(Bom);list.add(John);list.add(Raul);
        list.forEach(n-> System.out.println(n.toString()));
    }
}
