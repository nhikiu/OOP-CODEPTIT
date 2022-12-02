package codeptit.J07059_DANH_SACH_CA_THI;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Shift> shifts = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            shifts.add(new Shift(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        shifts.sort((o1, o2) -> {
            try {
                if (o1.getDate().equals(o2.getDate())) {
                    if (o1.getTime().equals(o2.getTime())) {
                        return o1.getId().compareTo(o2.getId());
                    }
                    return o1.getTime().compareTo(o2.getTime());
                }
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            try {
                return o1.getDate().compareTo(o2.getDate());
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        });

        shifts.forEach(System.out::println);
    }
}

class Shift {
    private String id;
    private String date;
    private String time, room;

    public Shift(int id, String date, String time, String room) throws ParseException {
        this.id = String.format("C%03d", id);
        this.date = date;
        this.time = time;
        this.room = room;
    }

    public String getId() {
        return id;
    }

    public Date getDate() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(date);
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return id + " " + date + " " + time + " " + room;
    }
}