package Game;

import Game.Heroes.Peasant;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, My Game !");
        Peasant Tom = new Peasant(null, 0, 0, 0, 0);
        System.out.println(Tom);
    }
}
