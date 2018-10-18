import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {

        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "X" + j + "=" + i * j + ", ");
            }
            System.out.println();
            System.out.println();
        }
        //-----HashMap Examples--------
        HashMap<String, String> ssn = new HashMap<String, String>();
        ssn.put("111-11-1111", "Superman");
        ssn.put("222-22-2222", "Batman");
        System.out.println(ssn.size());
        System.out.println(ssn.get("222-22-2222"));
    }
}