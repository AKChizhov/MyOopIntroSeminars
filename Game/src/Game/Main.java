package Game;
import java.util.ArrayList;
import java.util.Random;

import Game.Heroes.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, My Game !");

        Peasant Tom = new Peasant(getname(), 0);
        System.out.println(Tom.Endurance( 20));

        Archer Tim = new Archer(getname(), 50);
        System.out.println(Tim.StrikeLong(0, 20, 0));

        Robber Bill = new Robber(getname(), 40);
        Pikeman Rod = new Pikeman(getname(), 20);
        Crossbowman Mike = new Crossbowman(getname(), 10);
        Sniper Bom = new Sniper(getname(), 50);
        Monk John = new Monk(getname(), 10);
        Mag Raul = new Mag(getname(), 20);

        ArrayList<BaseHero> list = new ArrayList<>();
        list.add(Tim);list.add(Tom);list.add(Bill);list.add(Rod);list.add(Mike);list.add(Bom);list.add(John);list.add(Raul);
        //System.out.println(getname());
        list.forEach(n-> System.out.println(n.toString()));
    }

    private static String getname(){
        //String b = Names.values()[new Random().nextInt(Names.values().length)];
       // return String.valueOf(b);
       //return b;
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
