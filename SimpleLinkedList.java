//35. Write a Java program using LinkedList and demonstrate insertion and deletion operations.
import java.util.LinkedList;
public class SimpleLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // Insertion
        list.add("pineapple");          // add at end
        list.addFirst("Apple");      // add at beginning
        list.addLast("Cherry");      // add at end
        list.add(1, "Mango");        // add at index 1
        System.out.println("After insertion: " + list);
        list.removeFirst();          // remove first element
        System.out.println("After removeFirst: " + list);
        list.removeLast();           // remove last element
        System.out.println("After removeLast: " + list);
        list.remove("Mango");        // remove by value
        System.out.println("After remove(\"Mango\"): " + list);
    }}