import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Scores {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PriorityQueue<Integer> mi = new PriorityQueue();
        PriorityQueue<Integer> ma = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        while (true) {
            System.out.println("Please Enter a Number: ");
            int number = s.nextInt();
            mi.add(number);
            ma.add(number);
            System.out.println("The Biggest Number Was: " + ma.peek());
            System.out.println("The Smallest Number Was: " + mi.peek());
        }
    }
}
