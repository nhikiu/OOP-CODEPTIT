package codeptit.J04011_BON_DIEM_TREN_MAT_PHANG;

import java.util.Scanner;

public class J04011_BON_DIEM_TREN_MAT_PHANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}

class Point3D{
    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static boolean check(Point3D A, Point3D B, Point3D C, Point3D D){
        // 4 diem A, B, C, D dong phang khi [AB, AC].AD = 0
        Point3D AB = new Point3D(B.x - A.x, B.y - A.y, B.z - A.z);
        Point3D AC = new Point3D(C.x - A.x, C.y - A.y, C.z - A.z);
        Point3D AD = new Point3D(D.x - A.x, D.y - A.y, D.z - A.z);
        Point3D res = new Point3D(AB.y * AC.z - AC.y * AB.z, AB.z * AC.x - AC.z * AB.x, AB.x * AC.y - AC.x * AB.y);

        //[AB, AC].AD

        if(res.x * AD.x + res.y * AD.y + res.z * AD.z == 0) return true;
        return false;
    }
}