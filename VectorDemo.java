// Vectors in java 
import java.util.*;
class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        // 1. Insertion
        v.add("red");
        v.add("green");
        v.add("yellow");
        System.out.println("Vector: " + v);

        // 2. Insert at first and last
        v.add(0, "pink");
        v.add("orange");
        System.out.println("After insertion: " + v);

        // 3. Access elements
        System.out.println("First: " + v.firstElement());
        System.out.println("Last: " + v.lastElement());
        System.out.println("Element at index 2: " + v.get(2));

        // 4. Update an element
        v.set(1, "navy blue");
        System.out.println("After updating: " + v);

        // 5. Delete elements
        v.remove("green");
        v.remove(0);
        System.out.println("After deletion: " + v);

        // 6. Search an element
        System.out.println("Contains green: " + v.contains("green"));
        System.out.println("Index of navy blue: " + v.indexOf("navy blue"));

        // 7. Find size and capacity
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());

        // 8. Traverse the Vector
        System.out.println("Elements:");
        for (String item : v) {
            System.out.println(item);
        }

        // 9. Check whether Vector is empty
        System.out.println("Is empty: " + v.isEmpty());

        // 10. Clear the Vector
        v.clear();
        System.out.println("After clearing: " + v);
    }
}
