import java.util.TreeMap;

public class OverwriteKVExample {

    public static void main(String[] args) {
        TreeMap<String, String> people = new TreeMap<String, String>();
        people.put("remy", "martin");
        people.put("remy", "osbourne");
        people.put("wes", "mcmillen");
        people.put("johnas", "newsome");
        System.out.println(people);
    }
}

