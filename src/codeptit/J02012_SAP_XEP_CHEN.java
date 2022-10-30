package codeptit;

import java.util.Scanner;

public class J02012_SAP_XEP_CHEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        insertionSort(a);
    }

    public static void insertionSort(int[] a) {
        int j, tmp = 0;
        for (int i = 0; i < a.length; i++){
            tmp = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > tmp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = tmp;
            System.out.print("Buoc " + i + ": ");
            for (int k = 0; k <= i; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
