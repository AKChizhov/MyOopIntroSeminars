package Game;
import Game.Heroes.Archer;
import Game.Heroes.Peasant;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, My Game !");
        Peasant Tom = new Peasant("Tom", 0);
        System.out.println(Tom.Endurance( 20));
        Archer Tim = new Archer("Tim", 50, 0, 0, 0, 0, 20);
        System.out.println(Tim.StrikeLong(0, 20, 0));
    }

}
