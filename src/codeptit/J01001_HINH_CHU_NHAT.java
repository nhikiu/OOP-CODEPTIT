package codeptit;

import java.util.Scanner;

public class J01001_HINH_CHU_NHAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt(), width = scanner.nextInt();
        if(length <= 0 || width <= 0){
            System.out.println(0);
        } else {
            int p = (length + width) * 2, s = length * width;
            System.out.println(p + " " + s);
        }
    }
}