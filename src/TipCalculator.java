import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TipCalculator {
    private double amount;
    private double tipPercent;
    private double taxPercent;

    public TipCalculator(double amount, double tipPercent, double taxPercent) {
        this.amount = amount;
        this.taxPercent = taxPercent;
        this.tipPercent = tipPercent;
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("res/poem.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void caculateTotalBill() {
        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter Amount: ");
        String amount = keyboard.next();
        double total = Double.parseDouble(amount);
        double bill = total + total * 0.06 + total * 0.2;
        System.out.println("Your Total Bill Is: " + bill);
    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }
}
