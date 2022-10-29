package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001_DOC_FILE_VAN_BAN {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}