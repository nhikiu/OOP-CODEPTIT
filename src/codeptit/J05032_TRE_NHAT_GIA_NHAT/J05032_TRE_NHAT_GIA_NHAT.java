package codeptit.J05032_TRE_NHAT_GIA_NHAT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05032_TRE_NHAT_GIA_NHAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        ArrayList<Person> arrayList = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            arrayList.add(new Person(scanner.next(), scanner.next()));
        }

        Collections.sort(arrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getDob().substring(6, 10).equals(o2.getDob().substring(6, 10))){
                    if(o1.getDob().substring(3, 5).equals(o2.getDob().substring(3, 5))) {
                        return o1.getDob().substring(0,2).compareTo(o2.getDob().substring(0,2));
                    }
                    return o1.getDob().substring(3,5).compareTo(o2.getDob().substring(3,5));
                }
                return o1.getDob().substring(6,10).compareTo(o2.getDob().substring(6,10));

            }
        });

        System.out.println(arrayList.get(arrayList.size() - 1).getName()+ "\n" + arrayList.get(0).getName());
    }
}

class Person{
    private String name;
    private String dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}