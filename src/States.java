import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class States {
    public static void main(String[] args) throws Exception {
        File file = new File("res/states.txt");
        Scanner scanner = new Scanner(file);
        HashMap<String, String> states = new HashMap<String, String>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] entry = line.split(",");
            String name = entry[0];
            String abr = entry[1];
            states.put(abr, name);
        }
        scanner.close();
        System.out.println("There Are " + states.size() + " States In This File.");
        System.out.println("The Abbreviation of State Of GA is " + states.get("GA"));
        System.out.println("The Abbreviation of State Of PA is " + states.get("PA"));
//            -----HashMap Examples--------
//            HashMap<String, String> ssn = new HashMap<String, String>();
//            ssn.put("111-11-1111", "Superman");
//            ssn.put("222-22-2222", "Batman");
//            System.out.println(ssn.size());
//            System.out.println(ssn.get("222-22-2222"));
    }
}

