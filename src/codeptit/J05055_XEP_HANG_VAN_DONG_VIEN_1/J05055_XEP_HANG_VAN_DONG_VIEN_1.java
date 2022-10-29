package codeptit.J05055_XEP_HANG_VAN_DONG_VIEN_1;

import java.util.*;

public class J05055_XEP_HANG_VAN_DONG_VIEN_1 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        List<Athlete> athletes = new ArrayList<>();
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            athletes.add(new Athlete(i + 1, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        Collections.sort(athletes, new Comparator<Athlete>() {
            @Override
            public int compare(Athlete o1, Athlete o2) {
                return o1.getTime().compareTo(o2.getTime());
            }
        });

        athletes.get(0).setRank(1);
        for (int i = 1; i < athletes.size(); i++) {
            if (athletes.get(i).getTime().equals(athletes.get(i-1).getTime())){
                athletes.get(i).setRank(athletes.get(i-1).getRank());
            }
            else athletes.get(i).setRank(i + 1);
        }

        Collections.sort(athletes, new Comparator<Athlete>() {
            @Override
            public int compare(Athlete o1, Athlete o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });

        for (Athlete athlete : athletes){
            System.out.println(athlete);
        }
    }

}

class Athlete{
    private int id;
    private String name;
    private String dob;
    private String start;
    private String end;
    private int rank;

    public Athlete(int id, String name, String dob, String start, String end) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.start = start;
        this.end = end;
    }

    public String getId() {
        return String.format("VDV%02d", id);
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getBonus(){
        int age = 2021 - Integer.parseInt(dob.substring(6,10));
        if (age < 18) return "00:00:00";
        if (age < 25) return "00:00:01";
        if (age < 32) return "00:00:02";
        return "00:00:03";
    }

    public static String subTime(String b, String e){
        int hour = Integer.parseInt(e.substring(0,2)) - Integer.parseInt(b.substring(0,2));
        int minute = Integer.parseInt(e.substring(3,5)) - Integer.parseInt(b.substring(3,5));
        int second = Integer.parseInt(e.substring(6,8)) - Integer.parseInt(b.substring(6,8));
        if (second < 0){
            second += 60;
            minute--;
        }
        if (minute < 0){
            minute += 60;
            hour--;
        }
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String getTime(){
        return subTime(getBonus(), subTime(start, end));
    }

    @Override
    public String toString() {
        return getId() + " " + name + " " + subTime(start, end) + " " + getBonus() + " " + getTime() + " " + rank;
    }
}