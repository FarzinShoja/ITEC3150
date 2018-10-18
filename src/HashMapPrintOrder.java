import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapPrintOrder {

    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("ITEC3150", "Advance Programing");
        map.put("ITEC4620", "Software Testing QA");
        map.put("ITEC4860", "Software Projects");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
