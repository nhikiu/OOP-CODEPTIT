package codeptit.J06007_BANG_TINH_GIO_CHUAN;

public class Subject {
    private String id;
    private String name;

    public Subject(String s) {
        String[] tmp = s.split(" ");
        this.id = tmp[0];
        String res = "";
        for (int i = 1; i < tmp.length; i++) {
            res += tmp[i] + " ";
        }
        this.name = res.trim();
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

    @Override
    public String toString() {
        return name + " " + id;
    }
}
