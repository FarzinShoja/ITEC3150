import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {


    public static void main(String[] args) {
        PriorityQueue<Integer> nums = new PriorityQueue();
        nums.add(1);
        nums.add(100);
        nums.add(-100);
        nums.add(77);
        nums.add(5);
        PriorityQueue<Integer> nums2 = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        nums2.add(100);
        nums2.add(23);
        nums2.add(1);
        System.out.println(nums2.poll());
    }
}

