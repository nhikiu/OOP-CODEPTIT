package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07076_SAP_XEP_MA_TRAN {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String[] ip1 = sc.nextLine().split("\\s+");
            int row = Integer.parseInt(ip1[0]), column = Integer.parseInt(ip1[1]);
            int k = Integer.parseInt(ip1[2]);

            String[] ip2 = sc.nextLine().split("\\s+");
            int[][] matrix = new int[row][column];
            int cnt = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j] = Integer.parseInt(ip2[cnt]);
                    cnt++;
                    if (j == k - 1) {
                        list.add(matrix[i][j]);
                    }
                }
            }
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                matrix[i][k - 1] = list.get(i);
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
