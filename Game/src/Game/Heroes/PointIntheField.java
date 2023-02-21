package Game.Heroes;
//import java.lang.Math.*;

public class PointIntheField {
    protected int x,y; 
        
    public PointIntheField(int x, int y){

        this.x = x;
        this.y = y;
    }

    public double calculate(PointIntheField pointA ,PointIntheField pointB){
        
       
        return  Math.sqrt((pointA.x - pointB.x)^2 + (pointA.y - pointB.y)^2);
        
    }
}
