import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class sinhFileNhiPhan{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu trong file nhi phan: ");
        int n=sc.nextInt();
        System.out.print("Nhap cac phan tu trong file nhi phan:");
        while(n-->0){
            int x=sc.nextInt();
            list.add(x);
        }
        File file = new File("DATA2.in");
        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(list);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}