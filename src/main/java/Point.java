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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        //return x.equals(point.x) && y.equals(point.y);
        //pas réussi mais je suppose qu'il fallait aller dans cette direction
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x); //pas fini non plus
    }
}

