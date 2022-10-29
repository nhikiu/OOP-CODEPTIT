package codeptit.J05033_SAP_XEP_THOI_GIAN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05033_SAP_XEP_THOI_GIAN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Time> arr = new ArrayList<>();
        int n = scanner.nextInt();
        while(n-- > 0){
            arr.add(new Time(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }

        Collections.sort(arr, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if(o1.getHour() == o2.getHour()){
                    if(o1.getMinute() == o2.getMinute()){
                        return o1.getSecond() > o2.getSecond() ? 1 : -1;
                    }
                    return o1.getMinute() > o2.getMinute() ? 1 : -1;
                }
                return o1.getHour() > o2.getHour() ? 1 : -1;
            }
        });

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}


class Time{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString(){
        return hour + " " + minute + " " + second;
    }
}