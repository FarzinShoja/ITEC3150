import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test1 {


    public static void main(String[] args) {
        PrintNums();
        System.out.println();
        ArrayList<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Bart");
        names.add("Homer");
        System.out.println();
        System.out.println(reverseStrings(names));
        String str = "alphabet";
        String str2 = "missisppi";
        System.out.println();
        System.out.println(firstUniqueChar(str));
        System.out.println(firstUniqueChar(str2));
    }

    public static int numOfUnigueName(ArrayList<String> names) {
        HashSet<String> set = new HashSet<>();
        for (String name : names) {
            set.add(name);
        }
        return set.size();
    }

    public static void PrintNums() {
        int i = 1000;
        while (i >= 0) {
            System.out.println(i);
            i -= 10;
        }
    }

    public static ArrayList<String> reverseStrings(ArrayList<String> names) {
        ArrayList<String> r = new ArrayList<>();
        for (int i = names.size() - 1; i >= 0; i--) {
            r.add(names.get(i));
        }
        return r;
    }

    public static char firstUniqueChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), count + 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }

        }
        return str.charAt(0);
    }
}

