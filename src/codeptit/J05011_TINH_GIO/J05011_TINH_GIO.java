package codeptit.J05011_TINH_GIO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05011_TINH_GIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Player> arrayList = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            arrayList.add(new Player(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(arrayList, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.getTime().compareTo(o1.getTime());
            }
        });

        for (int i = 0; i < t; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
class Player{
    private String id;
    private String name;
    private String checkIn;
    private String checkOut;

    public Player(String id, String name, String checkIn, String checkOut) {
        this.id = id;
        this.name = name;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getTime(){
        int hourIn = Integer.parseInt(checkIn.substring(0,2));
        int minuteIn = Integer.parseInt(checkIn.substring(3,5));
        int hourOut = Integer.parseInt(checkOut.substring(0,2));
        int minuteOut = Integer.parseInt(checkOut.substring(3,5));
        if (minuteIn > minuteOut){
            minuteOut += 60;
            hourOut -= 1;
        }
        return String.format("%02d%02d", hourOut - hourIn, minuteOut - minuteIn);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + Integer.parseInt(getTime().substring(0,2)) + " gio " + Integer.parseInt(getTime().substring(2,4)) + " phut";
    }
}