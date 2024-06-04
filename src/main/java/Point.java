import java.util.Objects;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.y=y;
        this.x=x;
    }

    public Point(){};
    public Point add(Point other) {
        Point result= new Point();
        result.x =this.x + other.x;
        result.y =this.y + other.y;
        return result;
    }


    @Override
    public String toString() {
        return "("+this.x+","+" "+this.y+")";
    }

}

