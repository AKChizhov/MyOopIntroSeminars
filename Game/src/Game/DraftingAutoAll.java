package Game;

import java.util.ArrayList;
import java.util.Random;
import Game.Heroes.*;

public class DraftingAutoAll {
    public static int[] platoon = null;

    static ArrayList<BaseHero> MyRealSubdivision(int color) {

        ArrayList<BaseHero> list = new ArrayList<>();
        int[] platoonRed = { 1, 2, 4, 5, 6 };
        int[] platoonBlue = { 0, 2, 3, 7 };
        if (color == 1) {
            platoon = platoonBlue.clone();
        } else {
            platoon = platoonRed.clone();
        }
        int count = 0;
        while (count < 10) {
            Random random = new Random();
            Integer index = random.nextInt(8);

            for (int x : platoon) {
                if (x == index) {
                    Integer indexPower = random.nextInt(9);
                    indexPower = (indexPower + 1) * 10;
                    if (index == 0) {
                        list.add(new Archer(getname(), indexPower));
                    } else if (index == 1) {
                        list.add(new Crossbowman(getname(), indexPower));
                    } else if (index == 2) {
                        list.add(new Mag(getname(), indexPower));
                    } else if (index == 3) {
                        list.add(new Monk(getname(), indexPower));
                    } else if (index == 4) {
                        list.add(new Peasant(getname(), indexPower));
                    } else if (index == 5) {
                        list.add(new Pikeman(getname(), indexPower));
                    } else if (index == 6) {
                        list.add(new Robber(getname(), indexPower));
                    } else if (index == 7) {
                        list.add(new Sniper(getname(), indexPower));
                    }
                    count++;
                }
            }

        }

        System.out.println("");
        list.forEach(n -> System.out.println(n.toString()));
        System.out.println("\n");
        return list;

    }

    private static String getname() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
