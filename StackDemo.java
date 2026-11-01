// Stack implementing 
import java.util.*;

class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // Inserting elements
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println("Stack: " + s);

        // Display top element
        System.out.println("Top element: " + s.peek());

        // Removing element
        System.out.println("Removed: " + s.pop());

        // Searching element
        System.out.println("Position of 20: " + s.search(20));

        // Checking whether stack is empty
        System.out.println("Is stack empty? " + s.empty());

        // Display updated stack
        System.out.println("Final Stack: " + s);
    }
}
