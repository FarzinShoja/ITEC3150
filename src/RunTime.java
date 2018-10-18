import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class RunTime {

    public static void main(String[] args) {

        int[] prime1 = getRandomArray(80000);
        int[] prime2 = getRandomArray(80000);
        int[] prime3 = getRandomArray(60000);
        int[] prime4 = getRandomArray(60000);


        System.out.println(getCommonElements(prime1, prime2));
        System.out.println(getCommonElements(prime3, prime4));
        System.out.println("Time It Took: " + getTimeToSort(prime1, prime2));
        System.out.println("Time It Took: " + getTimeToSort(prime3, prime4));

    }

    public static ArrayList<Integer> getCommonElements(int[] numer1, int[] numer2) {
        ArrayList<Integer> commons = new ArrayList<>();

        for (int i = 0; i < numer1.length; i++) {
            for (int j = 0; j < numer2.length; j++) {
                if (numer1[i] == numer2[j]) {
                    if (!(commons.contains(numer1[i]))) {
                        commons.add(numer2[i]);
                    }
                }
            }
        }
        return commons;
    }

    public static int[] getRandomArray(int size) {
        int[] nums = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            nums[i] = r.nextInt();
        }
        return nums;
    }

    public static long getTimeToSort(int[] nums1, int[] nums2) {
        long start = System.currentTimeMillis();
        getCommonElements(nums1, nums2);
        long end = System.currentTimeMillis();
        return end - start;
    }
}

