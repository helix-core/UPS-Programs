import java.util.Stack;

public class CountStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println("Total number of elements in the stack: " + stack.size());
    }
}