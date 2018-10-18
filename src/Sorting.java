import java.util.Arrays;
import java.util.Random;

public class Sorting {

    public static void main(String[] args) {
        int[] nums1 = getRandomArray(10000000);
        int[] nums2 = getRandomArray(20000000);
        int[] nums3 = getRandomArray(40000000);

        System.out.println(getTimeToSort(nums1));
        System.out.println(getTimeToSort(nums2));
        System.out.println(getTimeToSort(nums3));

    }

    public static int[] getRandomArray(int size) {
        int[] nums = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            nums[i] = r.nextInt();
        }
        return nums;
    }

    public static long getTimeToSort(int[] nums) {
        long start = System.currentTimeMillis();
        Arrays.sort(nums);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
