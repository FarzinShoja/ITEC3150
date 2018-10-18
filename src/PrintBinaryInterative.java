import java.util.ArrayList;
import java.util.Stack;


//Write a iterative version of printBinary
// create a stack and push 1 and 0
//pop them and append 1 and 0, add to arraylist
//empty arraylist and push to stack repeat
public class PrintBinaryInterative {

    public static void main(String[] args) {
        printBinaryIterative(5);

    }

    public static void printBinaryIterative(int n) {

        Stack<String> stack = new Stack<String>();
        ArrayList<String> temp = new ArrayList<String>();
        stack.push("0");
        stack.push("1");
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < Math.pow(2, i); j++) {
                temp.add(stack.peek() + "1");
                temp.add(stack.pop() + "2");
            }
            for (int j = (int) (Math.pow(2, i + 1)) - 1; j >= 0; j--) {
                stack.push(temp.remove(j));
            }
        }
        System.out.println(stack);
    }
}
