public class StringPermutations {

    public static void main(String[] args) {
        permute("", "car", "car".length());


    }

    public static void permute(String p, String original, int length) {
        if (p.length() == length) {
            System.out.println(p);
        }

        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            permute(p + c, original.substring(0, i) + original.substring(i + 1), length);
        }
    }
}
