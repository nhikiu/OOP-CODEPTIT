package codeptit.J04002_KHAI_BAO_LOP_HINH_CHU_NHAT;

import java.util.Scanner;

public class J04002_KHAI_BAO_LOP_HINH_CHU_NHAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle r = new Rectangle(scanner.nextInt(), scanner.nextInt(), scanner.next());
        System.out.println(r);
    }
}

class Rectangle{
    private int width;
    private int height;
    private static String color;

    public Rectangle() {
    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static String getColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public static void setColor(String color) {
        Rectangle.color = color;
    }

    public int findArea(){
        return width * height;
    }

    public int findPerimeter(){
        return (width + height) * 2;
    }

    @Override
    public String toString(){
        if(height <= 0 || width <= 0){
            return "INVALID";
        } else {
            return findPerimeter() + " " + findArea() + " " + getColor();
        }
    }
}