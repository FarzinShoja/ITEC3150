import java.util.Arrays;

public class illegalArgumentExample {


    public static void main(String[] args) {
        System.out.println(isAnagram("car", "arc"));
        System.out.println(isAnagram("add", "dad"));
        System.out.println(isAnagram("repeat", "retape"));


    }

    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }


    public static boolean isValidAge(int age) throws Exception {
        if (age < 0) {
            throw new IllegalArgumentException("Age Must be > 0");
        }
        return (age >= 18);
    }


}
