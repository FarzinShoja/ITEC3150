import java.util.ArrayList;
import java.util.Stack;

public class RecursiveExcercise {

    public static void main(String[] args) {
        // printBinary(0, "");

    }

    public static void printBinary(int n, String str) {
        if (n == 5) {
            System.out.println(str);
            return;
        }
        printBinary(n + 1, str + "0");
        printBinary(n + 1, str + "1");
    }
}



