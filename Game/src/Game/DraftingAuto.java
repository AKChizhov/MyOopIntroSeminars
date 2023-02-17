package Game;

import java.util.ArrayList;
import java.util.Random;
import Game.Heroes.*;

public class DraftingAuto {

    static ArrayList<BaseHero> MyRealSubdivision() {
        ArrayList<BaseHero> list2 = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Random random = new Random();
            Integer index = random.nextInt(4);
            Integer indexPower = random.nextInt(9);
            indexPower = (indexPower + 1) * 10;
            // if(index == 0){ list2.add (new Archer(getname(),indexPower));
            if (index == 0) {
                list2.add(new Crossbowman(getname(), indexPower));
                // } else if(index == 2){list2.add (new Mag(getname(),indexPower));
            } else if (index == 1) {
                list2.add(new Monk(getname(), indexPower));
            } else if (index == 2) {
                list2.add(new Peasant(getname(), indexPower));
                // else if(index == 5){list2.add (new Pikeman(getname(),indexPower));
            } else if (index == 3) {
                list2.add(new Robber(getname(), indexPower));
            }
            // } else if(index == 7){list2.add (new Sniper(getname(),indexPower));}

            /*
             * 
             * ArrayList<BaseHero> list10 = new ArrayList<>();
             * for(int ii=0; ii <= 9; ii++){
             * //Random random = new Random();
             * index = random.nextInt(4);
             * //Integer indexPower = random.nextInt(9);
             * indexPower = (indexPower +1) *10;
             * if(index == 0){ list10.add (new Archer(getname(),indexPower));
             * //} else if(index == 1){list2.add (new Crossbowman(getname(),indexPower));
             * } else if(index == 1){list10.add (new Mag(getname(),indexPower));
             * //} else if(index == 3){list2.add (new Monk(getname(),indexPower));
             * } else if(index ==2){list10.add (new Peasant(getname(),indexPower));
             * } else if(index == 3){list10.add (new Pikeman(getname(),indexPower));
             * //} else if(index == 6){list2.add (new Robber(getname(),indexPower));
             * //} else if(index == 7){list2.add (new Sniper(getname(),indexPower));}
             * 
             */

        }

        System.out.println("");
        list2.forEach(n -> System.out.println(n.toString()));
        System.out.println("\n");

        return list2;
    }

 static  ArrayList<BaseHero> MyRealSubdivision2() {

 ArrayList<BaseHero> list10 = new ArrayList<>();
 
 for(int ii=0; ii <= 9; ii++){
     //Random random = new Random();
     index = random.nextInt(4);
     //Integer indexPower = random.nextInt(9);
     indexPower = (indexPower +1) *10;
     if(index == 0){ list20.add (new Archer(getname(),indexPower));
     //} else if(index == 1){list2.add (new Crossbowman(getname(),indexPower));
     } else if(index == 1){list10.add (new Mag(getname(),indexPower));
     //} else if(index == 3){list2.add (new Monk(getname(),indexPower));
     } else if(index ==2){list10.add (new Peasant(getname(),indexPower));
     } else if(index == 3){list10.add (new Pikeman(getname(),indexPower));
     //} else if(index == 6){list2.add (new Robber(getname(),indexPower));
     //} else if(index == 7){list2.add (new Sniper(getname(),indexPower));}

     System.out.println("");
     list2.forEach(n-> System.out.println(n.toString()));
     System.out.println("\n");

     return list20;
     }
     }

    private static String getname() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

}
