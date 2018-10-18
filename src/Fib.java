import java.sql.SQLOutput;

public class Fib {

    public static void main(String[] args) {
        printFib(6);
    }

    public static void printFib(int n) {
        if (n < 1) throw new IllegalArgumentException();
        if (n == 1) {
            System.out.println("1");
            return;
        }
        if (n == 2) {
            System.out.println("1");
            System.out.println("1");
            return;
        }
        System.out.println("1");
        System.out.println("1");
        int first = 1;
        int second = 2;
        int third;
        for (int i = 3; i <= n; i++) {
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}
