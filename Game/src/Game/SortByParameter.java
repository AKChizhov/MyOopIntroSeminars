package Game;

import java.util.ArrayList;
import java.util.Comparator;
import Game.Heroes.BaseHero;

public class SortByParameter {
    
    static ArrayList<BaseHero> MySorting(ArrayList<BaseHero> list){
        
        list.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2 ){
                return o2.getSpeed() - o1.getSpeed();
            }
        });
          
        return list;
    }
}   