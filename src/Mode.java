import java.util.HashMap;
import java.util.Random;

public class Mode {

    public static void main(String[] args) {
        Random r = new Random();
        int size = 30000000;
        int[] nums = new int[30000000];
        for (int i = 0; i < size; i++) {
            nums[i] = r.nextInt() % 100;
        }
        long start = System.currentTimeMillis();
        System.out.println(getMode(nums));
        long end = System.currentTimeMillis();
        System.out.println("It Took " + (end - start) + " ms");
    }


    public static int getMode(int[] nums) {
        //create a map that maintains the number of times that int appears in the array
        //
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int value = map.get(nums[i]);
                map.put(nums[i], value + 1);
            }
        }
        //return key with maximum value!
        int keyMax = nums[0];
        int valueMax = map.get(nums[0]);
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > valueMax) {
                keyMax = nums[i];
                valueMax = map.get(nums[i]);
            }
        }
        return keyMax;
    }
}
