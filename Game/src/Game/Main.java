package Game;

import java.util.ArrayList;
import java.util.Random;
import Game.Heroes.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, My Game !");
        ArrayList<BaseHero> list = new ArrayList<>();

        Peasant Tom = new Peasant(getname(), 10);
        System.out.println(Tom.Endurance( 20));

        Archer Tim = new Archer(getname(), 50);
        System.out.println(Tim.StrikeLong(0, 20, 0));
        list.forEach(n-> System.out.println(n.toString()));

        ArrayList<BaseHero> platoonHand = new ArrayList<>();
        System.out.println("\n\n\tThis is a list of the military specialties");
        platoonHand = DraftingHand.ListOfSpecialties();
        
        ArrayList<BaseHero> platoonAuto = new ArrayList<>();
        System.out.println("\n\n\tThis is a platoon of 10 fighters. Specialization received by Random");
        platoonAuto = DraftingAuto.MyRealSubdivision();
        //platoon.forEach(n-> System.out.println(n.toString()));

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
