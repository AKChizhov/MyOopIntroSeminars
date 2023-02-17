package Game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import Game.Heroes.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.println("\n\tHello, My Game !");
        /* 
        ArrayList<BaseHero> list = new ArrayList<>();
        Peasant Tom = new Peasant(getname(), 10);
        System.out.println(Tom.Endurance( 20));
        Archer Tim = new Archer(getname(), 50);
        System.out.println(Tim.StrikeLong(0, 20, 0));
        list.forEach(n-> System.out.println(n.toString()));
        */
        //ArrayList<BaseHero> platoonHand = new ArrayList<>();
        //System.out.println("\n\n\tThis is a list of the military specialties");
        //platoonHand = DraftingHand.ListOfSpecialties();
        
        //ArrayList<BaseHero> platoonAuto = new ArrayList<>();
        //platoonAuto = DraftingAuto.MyRealSubdivision();
        //platoon.forEach(n-> System.out.println(n.toString()));

        System.out.println("\n\tThis is a platoon BLUE of 10 fighters. Specialization received by Random");
        DraftingAutoAll.MyRealSubdivision(1);// Формирование взвода BLUE
        System.out.println("\n\tThis is a platoon RED of 10 fighters. Specialization received by Random");
        //DraftingAutoAll.MyRealSubdivision(0);// Формирование взвода RED
        ArrayList<BaseHero> platoonRed = DraftingAutoAll.MyRealSubdivision(0);
        
        platoonRed.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2 ){
                return o1.getSpeed() - o2.getSpeed();
            }
        });

        System.out.println("\n\tThis is a platoon RED. Sorted by parameter <SPEED>\n");
        platoonRed.forEach(n -> System.out.println(n.toString()));
        System.out.println("\n");
        
    }    

    private static String getname(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
/* 
    private static String getMilitarySpeciality(){
        String temp = String.valueOf(MilitarySpecialty.values()[new Random().nextInt(MilitarySpecialty.values().length)]);
        System.out.println(temp);
        return String.valueOf(MilitarySpecialty.values()[new Random().nextInt(MilitarySpecialty.values().length)]);  
    }
*/  



}
