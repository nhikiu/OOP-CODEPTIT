package codeptit;

import java.util.Scanner;

public class J02013_SAP_XEP_NOI_BOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        bubbleSort(a);
    }

    public static void bubbleSort(int[] a) {
        boolean check;
        for(int i = 0; i < a.length; i++){
            check = false;
            for (int j = 0; j < a.length - 1 - i; j++){
                if (a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    check = true;
                }
            }
            if (check == false) break;
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < a.length; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
