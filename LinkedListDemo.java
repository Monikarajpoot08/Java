// LinkedList class in java
import java.util.*;
class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 1. Insertion
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("LinkedList: " + list);

        // 2. Insert at first and last
        list.addFirst("Orange");
        list.addLast("Grapes");
        System.out.println("After insertion: " + list);

        // 3. Access elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // 4. Update an element
        list.set(1, "Pineapple");
        System.out.println("After updating: " + list);

        // 5. Delete elements
        list.remove("Mango");
        list.removeFirst();
        list.removeLast();
        System.out.println("After deletion: " + list);

        // 6. Search an element
        System.out.println("Contains Apple: " + list.contains("Apple"));

        // 7. Find size
        System.out.println("Size: " + list.size());

        // 8. Traverse the list
        System.out.println("Elements:");
        for (String item : list) {
            System.out.println(item);
        }

        // 9. Check whether list is empty
        System.out.println("Is empty: " + list.isEmpty());

        // 10. Clear the list
        list.clear();
        System.out.println("After clearing: " + list);
    }
}
