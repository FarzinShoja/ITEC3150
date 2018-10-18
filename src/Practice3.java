public class Practice3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int current = i;
            for (int j = 0; j < 5; j++) {
                System.out.print(current + (i * j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

