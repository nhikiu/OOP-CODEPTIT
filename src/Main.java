import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}

class Matrix {
    private int[][] a;

    public Matrix(int r, int c){
        a = new int[r][c];
    }

    public Matrix(int[][] a) {
        this.a = a;
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }

    public int getRow(){
        return a.length;
    }

    public int getColumn(){
        return a[0].length;
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public void output() {
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}