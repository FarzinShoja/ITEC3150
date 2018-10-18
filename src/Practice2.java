import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        ArrayList<Double> nums = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please Enter Number: ");
            double score = Double.parseDouble(keyboard.nextLine().trim());
            nums.add(score);
        }

        double max = nums.get(0);
        for (int i = 0; i < 5; i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        //System.out.printf("%10.d", max);
        System.out.println("The Highest Score is: " + max);
    }
}
