import java.util.Comparator;
import java.util.PriorityQueue;

public class BruteForce {

    public static void main(String[] args) {
        int[] nums = {-1, -2, 10, -10};
        System.out.println("The Max Product Of Two : " + maxProductOfTwo(nums));


    }

    public static int maxProductOfTwo(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2 - o1;
            }
        });
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                pq.add(nums[i] * nums[j]);
            }
        }
        return pq.peek();
    }

}
