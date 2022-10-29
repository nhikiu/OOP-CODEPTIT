package codeptit;

import java.util.Scanner;

public class J01003_GIAI_PHUONG_TRINH_BAC_NHAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }
        } else {
            System.out.printf("%.2f", -b/a);
        }
    }
}