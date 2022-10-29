package codeptit.J05070_CAU_LAC_BO_BONG_DA_2;

import java.util.*;

public class J05070_CAU_LAC_BO_BONG_DA_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTeam = scanner.nextInt();
        List<Team> teams = new ArrayList<>();
        HashMap<String, Team> hashMap = new HashMap<>();
        for (int i = 0; i < numberOfTeam; i++) {
            scanner.nextLine();
            teams.add(new Team(scanner.nextLine(), scanner.nextLine(), scanner.nextInt()));
            hashMap.put(teams.get(i).getId(), teams.get(i));
        }
        int numberOfMatch = scanner.nextInt();
        List<Match> matches = new ArrayList<>();
        for (int i = 0; i < numberOfMatch; i++) {
            matches.add(new Match(scanner.next(), scanner.nextInt()));
            matches.get(i).setTeam(hashMap.get(matches.get(i).getId().substring(1,3)));
        }

        Collections.sort(matches, new Comparator<Match>() {
            @Override
            public int compare(Match o1, Match o2) {
                if (o1.getTurnover() == o2.getTurnover()) {
                    return o1.getTeam().getName().compareTo(o2.getTeam().getName());
                }
                return o1.getTurnover() < o2.getTurnover() ? 1 : -1;
            }
        });

        matches.forEach(System.out::println);
    }
}

class Team {
    private String id;
    private String name;
    private int priceOfTicket;

    public Team(String id, String name, int priceOfTicket) {
        this.id = id;
        this.name = name;
        this.priceOfTicket = priceOfTicket;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceOfTicket() {
        return priceOfTicket;
    }

    public void setPriceOfTicket(int priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }
}

class Match {
    private String id;
    private int numberOfFans;
    private Team team;

    public Match(String id, int numberOfFans) {
        this.id = id;
        this.numberOfFans = numberOfFans;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumberOfFans() {
        return numberOfFans;
    }

    public void setNumberOfFans(int numberOfFans) {
        this.numberOfFans = numberOfFans;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getTurnover() {
        return team.getPriceOfTicket() * numberOfFans;
    }

    @Override
    public String toString() {
        return id + " " + team.getName() + " " + getTurnover();
    }
}