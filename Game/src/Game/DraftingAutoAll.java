package Game;

import java.util.ArrayList;
import java.util.Random;
import Game.Heroes.*;

public class DraftingAutoAll {
    public static String from = null;
    public static int[] platoon = null;

    static ArrayList<BaseHero> MyRealSubdivision(int color) {

        ArrayList<BaseHero> list = new ArrayList<>();
        int[] platoonRed = { 0, 2, 4, 6, 7 };//Список воинских специальностей взвода RED
        int[] platoonBlue = { 1, 3, 4, 5 };//Список воинских специальностей взвода BLUE
        int xCoord = 0;
        if (color == 1) {
            from = "BLUE";
            xCoord = 1;
            platoon = platoonBlue.clone();//Формируем взвод BLUE
        } else {
            from = "RED";
            xCoord = 10;
            platoon = platoonRed.clone();//Формируем взвод RED
        }
        int count = 1;
        while (count < 11) {
            Random random = new Random();
            Integer index = random.nextInt(8);

            for (int x : platoon) {
                //int yCoord = 1;
                if (x == index) {
                    Integer indexPower = random.nextInt(9);
                    indexPower = (indexPower + 1) * 10;
                    if (index == 0) {
                        list.add(new Archer(getname(),from,xCoord, count, indexPower));
                    } else if (index == 1) {
                        list.add(new Crossbowman(getname(), from,xCoord, count, indexPower));
                    } else if (index == 2) {
                        list.add(new Mag(getname(),from,xCoord, count, indexPower));
                    } else if (index == 3) {
                        list.add(new Monk(getname(), from,xCoord, count,indexPower));
                    } else if (index == 4) {
                        list.add(new Peasant(getname(),from,xCoord, count, 1));
                    } else if (index == 5) {
                        list.add(new Pikeman(getname(),from,xCoord, count, indexPower));
                    } else if (index == 6) {
                        list.add(new Robber(getname(),from,xCoord, count, indexPower));
                    } else if (index == 7) {
                        list.add(new Sniper(getname(),from,xCoord, count ,indexPower));
                    }
                    count++;//Пока не наберем 10 бойцов
                }
            }

        }

        return list;
    }

    private static String getname() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
