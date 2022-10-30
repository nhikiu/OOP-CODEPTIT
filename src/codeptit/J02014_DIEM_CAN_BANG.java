package codeptit;

import java.util.Scanner;

public class J02014_DIEM_CAN_BANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int check = 0, sum = 0;
            int[] a = new int[n];
            int[] mark = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                mark[i] = sum - a[i];
            }
            for(int i = 0; i < n; i++){
                if(mark[i] == sum - a[i] - mark[i]){
                    check = 1;
                    System.out.println(i + 1);
                    break;
                }
            }
            if(check == 0) System.out.println(-1);
        }
    }
}
