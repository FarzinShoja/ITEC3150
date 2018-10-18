public class removeX {

    public static void main(String[] args) {
        removeLetterX("xoxoxo", "");

    }

    public static void removeLetterX(String orig, String nox) {
        if (orig.length() == 0) {
            System.out.println(nox);
            return;
        }
        if (orig.charAt(0) == 'x') {
            removeLetterX(orig.substring(1), nox);
        } else {
            removeLetterX(orig.substring(1), nox + orig.charAt(0));
        }
    }
}
