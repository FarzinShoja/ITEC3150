public class Practice {

    public static void main(String[] args) {
        //Using a loop, print out even number from 100, 98, 96, ....
        int i = 100;
        while (i >= 0) {
            System.out.println(i + " ");
            i -= 2;
        }
        System.out.println();
        for (int j = 100; j >= 0; j -= 2) {
            System.out.println(j + " ");
        }
        System.out.println();
        for (int j = 100; j >= 0; j--) {
            if (j % 2 == 0) System.out.println(j + " ");
        }
    }
}
