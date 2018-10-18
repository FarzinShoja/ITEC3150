import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class SortingExample {

    public static void main(String[] args) {
        int[] nums = new int[1000000];
        int[] nums2 = new int[1000000];
        Random r = new Random();
        for (int i = 0; i < 1000000; i++) {
            nums[i] = r.nextInt() % 100;
            nums2[i] = r.nextInt() % 100;
        }

        long i = System.currentTimeMillis();
        System.out.println(getMedian(nums));
        long j = System.currentTimeMillis();
        System.out.println("First Approach " + (j - i));


        long x = System.currentTimeMillis();
        System.out.println(getMedian2(nums2));
        long y = System.currentTimeMillis();
        System.out.println("Second Approach " + (y - x));
    }

    public static double getMedian(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int index = nums.length / 2;
        if (nums.length % 2 == 1) {
            return nums[index];
        } else {
            return (nums[index] + nums[index - 1]) / 2.0;
        }
    }

    public static double getMedian2(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        int index = nums.length / 2;
        if (nums.length % 2 == 1) {
            int m = nums[0];
            for (int i = 0; i <= index; i++) {
                m = pq.poll();
            }
            return m;
        } else {
            int m = nums[0];
            int n = nums[0];
            for (int i = 0; i < index; i++) {
                n = pq.poll();
                m = pq.poll();
            }
            return (n + m) / 2.0;
        }
    }
}