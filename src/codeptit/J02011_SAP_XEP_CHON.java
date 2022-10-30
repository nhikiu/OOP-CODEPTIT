package codeptit;

import java.util.Scanner;

public class J02011_SAP_XEP_CHON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        selectionSort(a);
    }

    public static void selectionSort(int[] a) {
        int m;
        for (int i = 0; i < a.length - 1; i++) {
            m = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[m]) {
                    m = j;
                }
            }
            int tmp = a[i];
            a[i] = a[m];
            a[m] = tmp;
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] +" ");
            }
            System.out.println();
        }
    }
}
