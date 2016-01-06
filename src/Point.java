import java.util.*;

/**
 * This class represents a Point with X and Y coordinates and supports the
 * calculation of distances and mid points.
 */
public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float distance(Point p) {
        float x1 = this.x - p.x;
        float y1 = this.y - p.y;
        return (float) Math.sqrt(x1 * x1 + y1 * y1);
    }

    public Point midpoint(Point p) {
        return new Point((this.x + p.x) / 2, (this.y + p.y) / 2);
    }

    public void display() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X-coordinate of 1st point : ");
        float x1 = scanner.nextFloat();
        System.out.print("Enter Y-coordinate of 1st point : ");
        float y1 = scanner.nextFloat();
        System.out.print("Enter X-coordinate of 2nd point : ");
        float x2 = scanner.nextFloat();
        System.out.print("Enter Y-coordinate of 2nd point : ");
        float y2 = scanner.nextFloat();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        System.out.println("Distance is  " + p1.distance(p2));
        System.out.print("Mid point is ");
        p1.midpoint(p2).display();
    }
}