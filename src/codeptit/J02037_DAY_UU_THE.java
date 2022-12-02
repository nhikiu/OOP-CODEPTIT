package codeptit;

import java.util.Scanner;

public class J02037_DAY_UU_THE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] tmp = sc.nextLine().split("\\s+");
            int numberOfEven = 0;
            for(String s : tmp) {
                if (Integer.parseInt(s) % 2 == 0) {
                    numberOfEven++;
                }
            }
            int numberOfOdd = tmp.length - numberOfEven;
            if (tmp.length % 2 == 0 && numberOfEven > numberOfOdd) {
                System.out.println("YES");
            } else if (tmp.length % 2 == 1 && numberOfEven < numberOfOdd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
