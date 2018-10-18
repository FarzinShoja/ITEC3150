public class StringReplaceExample {

    public static void main(String[] args) {
        System.out.println(replaceLetter("aadvark"));

    }

    public static String replaceLetter(String str) {
        str = str.toLowerCase();
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                newstr += 'b';
            } else {
                newstr += str.charAt(i);
            }
        }
        return newstr;
    }
}