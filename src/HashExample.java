import java.util.HashMap;
import java.util.TreeMap;

public class HashExample {

    public static void main(String[] args) {
        String college = "Georgia Gwinnett College";
        System.out.println(college.hashCode() % 16);
        String college1 = "Georgia Gwinnett Technical College";
        System.out.println(college1.hashCode() % 16);
        //HashMap<String, String> heroes = new HashMap<String, String>();
        TreeMap<String, String> heroes = new TreeMap<String, String>();
        heroes.put("Dr.Im", "Professor Cool Guy");
        heroes.put("Thanos", "Villian Bad Guy");
        heroes.put("Ant Man", "Has a Cool Name");
        System.out.println(heroes);
        System.out.println(heroes.get("Dr.Im"));

        for (String key : heroes.keySet()) {
            System.out.println("Hero: " + key + " " + heroes.get(key));
        }
    }
}
