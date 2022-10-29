package codeptit.J04010_DIEN_TICH_HINH_TRON_NGOAI_TIEP_TAM_GIAC;

import java.util.Scanner;

public class J04010_DIEN_TICH_HINH_TRON_NGOAI_TIEP_TAM_GIAC {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0){
            solve();
        }
    }

    public static void solve(){
        Point p1 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point p2 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point p3 = new Point(scanner.nextDouble(), scanner.nextDouble());

        double a = Point.distance(p1, p2);
        double b = Point.distance(p2, p3);
        double c = Point.distance(p3, p1);

        if(a + b > c && b + c > a && c + a > b){
            double S = Math.sqrt((a + b + c) * (a + b - c) * (-a + b + c) * (a - b + c))/4;
            double R = a * b * c / (4 * S);
            System.out.printf("%.3f\n", Math.PI * R * R);
        } else {
            System.out.println("INVALID");
        }
    }
}
class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
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

    public double distance(Point secondPoint) {
        return Math.sqrt(Math.pow(secondPoint.getX() - this.x, 2) + Math.pow(secondPoint.getY() - this.y, 2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}