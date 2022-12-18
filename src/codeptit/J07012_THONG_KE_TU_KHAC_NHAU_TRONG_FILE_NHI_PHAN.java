package codeptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J07012_THONG_KE_TU_KHAC_NHAU_TRONG_FILE_NHI_PHAN {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<String> inList;
        try {
            fis = new FileInputStream("DATA.in");
            ois = new ObjectInputStream(fis);
            inList = (ArrayList<String>) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (ois != null) {
                ois.close();
            }
        }
        TreeMap<String, Integer> map = new TreeMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < inList.size(); i++) {
            Matcher matcher = Pattern.compile("\\w+").matcher(inList.get(i).toLowerCase());
            while (matcher.find()) {
                String s = matcher.group();
                if (map.get(s) != null)
                    map.put(s, map.get(s) + 1);
                else {
                    map.put(s, 1);
                    list.add(s);
                }
            }
        }
        list.sort((o1, o2) -> {
            if (map.get(o1) == map.get(o2)) {
                return o1.compareTo(o2);
            }
            return map.get(o1) < map.get(o2) ? 1 : -1;
        });
        list.forEach(s -> System.out.println(s + " " + map.get(s)));
    }
}