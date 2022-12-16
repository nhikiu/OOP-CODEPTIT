package codeptit.J05019_LUONG_MUA_TRUNG_BINH;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Data> data = new ArrayList<>();
        while (t-- > 0) {
            Data d = new Data(data.size() + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            int tmp = -1;
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).getName().equals(d.getName())) {
                    tmp = i;
                    break;
                }
            }
            if (tmp == -1) {
                data.add(d);
            } else {
                data.get(tmp).setData(data.get(tmp).getData() + d.getData());
                data.get(tmp).setMinute(data.get(tmp).getMinute() + d.getMinute());
            }
        }
        data.forEach(System.out::println);
    }
}

class Data {
    private String id;
    private String name;
    private int minute;
    private int data;

    public Data(int id, String name, String begin, String end, int data) {
        this.id = String.format("T%02d", id);
        this.name = name;
        this.minute = getMinute(begin, end);
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    private int getMinute(String begin, String end) {
        int h = Integer.parseInt(end.substring(0, 2)) - Integer.parseInt(begin.substring(0, 2));
        int m = Integer.parseInt(end.substring(3, 5)) - Integer.parseInt(begin.substring(3, 5));
        if (m < 60) {
            m += 60;
            h -= 1;
        }
        return h * 60 + m;
    }

    private double getV() {
        return (float) data * 60 / minute;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", getV());
    }
}