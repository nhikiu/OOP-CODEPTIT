package codeptit.J07071_TEN_VIET_TAT;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Name> names = new ArrayList<>();
        while (n-- > 0) {
            names.add(new Name(sc.nextLine()));
        }
        Collections.sort(names);

        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            for (Name name : names) {
                int differentCharacter = 0;
                String sn = name.getNameLMF();
                if (s.length() == sn.length()) {
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) != sn.charAt(i)) {
                            differentCharacter++;
                        }
                    }
                }
                if (differentCharacter == 1) {
                    System.out.println(name);
                }
            }
        }

    }
}

class Name implements Comparable<Name>{
    private String name;

    public Name() {
    }

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLMF() {
        String[] tmp = name.split("\\s+");
        String res = "";
        for (int i = 0; i < tmp.length; i++) {
            res += Character.toUpperCase(tmp[i].charAt(0)) + ".";
        }
        return res.substring(0, res.length() - 1);
    }

    private String getFirstName() {
        String[] tmp = name.split("\\s+");
        return tmp[tmp.length - 1];
    }

    private String getLastName() {
        String[] tmp = name.split("\\s+");
        return tmp[0];
    }

    @Override
    public int compareTo(Name o) {
        if (getFirstName().equals(o.getFirstName())) {
            return getLastName().compareTo(o.getLastName());
        }
        return getFirstName().compareTo(o.getFirstName());
    }

    @Override
    public String toString() {
        return name;
    }
}