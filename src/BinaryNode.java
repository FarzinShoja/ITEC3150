import java.util.Stack;

public class BinaryNode {

    private BinaryNode left;
    private BinaryNode right;
    private int value;

    public BinaryNode(BinaryNode left, BinaryNode right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public static void main(String[] args) {
        BinaryNode leaf99 = new BinaryNode(null, null, 99);
        BinaryNode leaf199 = new BinaryNode(null, null, 199);
        BinaryNode leaf300 = new BinaryNode(null, null, 300);
        BinaryNode node200 = new BinaryNode(leaf199, leaf300, 200);
        BinaryNode node50 = new BinaryNode(null, leaf99, 50);
        BinaryNode root = new BinaryNode(node50, node200, 100);
//        inOrder(root);
//        System.out.println("postOrder");
//        postOrder(root);
//        System.out.println("preOrder");
//        preOrder(root);
        preOrderIterative(root);

    }

    public static void inOrder(BinaryNode node) {
        if (node == null) return;
        if (node.getLeft() != null) {
            inOrder(node.getLeft());
        }
        System.out.println(node.getValue());
        if (node.getRight() != null) {
            inOrder(node.getRight());
        }
    }

    public static void postOrder(BinaryNode node) {
        if (node == null) return;
        if (node.getLeft() != null) {
            postOrder(node.getLeft());
        }

        if (node.getRight() != null) {
            postOrder(node.getRight());
        }
        System.out.println(node.getValue());
    }

    public static void preOrder(BinaryNode node) {
        if (node == null) return;

        System.out.println(node.getValue());

        if (node.getLeft() != null) {
            preOrder(node.getLeft());
        }

        if (node.getRight() != null) {
            preOrder(node.getRight());
        }

    }

    public static void preOrderIterative(BinaryNode root) {
        Stack<BinaryNode> stack = new Stack<BinaryNode>();
        stack.push(root);
        while (root != null) {
            if (stack.empty()) {
                return;
            }
            BinaryNode node = stack.pop();
            if (node == null) {
                return;
            }
            System.out.println(node.getValue());
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
    }

    public static void inOrderIterative(BinaryNode root) {
        Stack<BinaryNode> stack = new Stack<>();
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                '}';
    }
}
