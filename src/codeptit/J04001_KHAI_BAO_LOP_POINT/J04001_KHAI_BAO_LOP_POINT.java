package codeptit.J04001_KHAI_BAO_LOP_POINT;

import java.util.Scanner;

public class J04001_KHAI_BAO_LOP_POINT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            Point p1 = new Point(scanner.nextDouble(), scanner.nextDouble());
            Point p2 = new Point(scanner.nextDouble(), scanner.nextDouble());
            System.out.printf("%.4f\n", Point.distance(p1, p2));
        }
    }
}
class Point{
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        setX(point.x);
        setY(point.y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(secondPoint.getX() - this.x, 2) + Math.pow(secondPoint.getY() - this.y, 2));
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    @Override
    public String toString(){
        return "(" + getX() + "," + getY() + ")";
    }
}