import java.util.Scanner;
import java.util.Stack;

public class Balance {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter a Sentence: ");
            String str = keyboard.nextLine();

            if (isBalanced(str)) {
                System.out.println("The Sentence is Balance.");
            } else
                System.out.println("The Sentence is Not Balance.");

            System.out.println("Type quit to End || Enter to Continue");
            String input = keyboard.nextLine();
            if (input.startsWith("quit")) break;
        }
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            }
            if (str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else
            return false;
    }
}


