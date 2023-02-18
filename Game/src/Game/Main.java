package Game;

import java.util.ArrayList;
import java.util.Random;
import Game.Heroes.*;
import Game.Printing;

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
        
        System.out.println("\n\tThis is a platoon BLUE of 10 fighters. Specialization received by Random");
        ArrayList<BaseHero> platoonBlue = DraftingAutoAll.MyRealSubdivision(1);// Формирование взвода BLUE
        System.out.println("\n\tThis is a platoon RED of 10 fighters. Specialization received by Random");
        ArrayList<BaseHero> platoonRed = DraftingAutoAll.MyRealSubdivision(0);// Формирование взвода RED
        
        System.out.println("\n\tThis is a platoon RED. Sorted by parameter <SPEED>\n");
        platoonRed = SortByParameter.MySorting(platoonRed);
        Printing.MyPrinting(platoonRed);

        System.out.println("\n\tThis is a platoon Blue. Sorted by parameter <SPEED>\n");
        platoonBlue = SortByParameter.MySorting(platoonBlue);
        Printing.MyPrinting(platoonBlue);
        System.out.println("\n");
        
    }    

    private static String getname(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

}
