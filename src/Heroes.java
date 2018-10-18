import java.io.File;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Heroes {

    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new File("res/heroes.txt"));
        TreeMap<String, String> heroes = new TreeMap<>();
        while (true) {
            System.out.println("Please Enter The Name of The Hero:");
            String name = keyboard.nextLine();
            System.out.println("Please Enter The Home-Town of The Hero:");
            String hometown = keyboard.nextLine();
            heroes.put(name, hometown);

            System.out.println("Type quit to End || Enter to Continue");
            String input = keyboard.nextLine();
            if (input.startsWith("quit")) break;
        }

        for (String key : heroes.keySet()) {
            pw.println(key + ":" + heroes.get(key));
        }

        //-------Another Way To Write This Code-------//
//        for (Map.Entry<String, String> entry : heroes.entrySet()) {
//            pw.write(entry.getKey() + ":" + entry.getValue() + System.getProperty("line.separator"));
//        }
//        heroes.forEach((k, v) -> pw.write(k + ":" + v + "\n"));
        keyboard.close();
        pw.close();
    }
}