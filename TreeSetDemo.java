
import java.util.*;

class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();

        // Adding elements
        s.add(30);
        s.add(10);
        s.add(20);
        s.add(40);
        s.add(20);
        s.add(50);
        s.add(60);

        System.out.println("TreeSet: " + s);

        // First and last elements access
        System.out.println("First: " + s.first());
        System.out.println("Last: " + s.last());

        // Search element
        System.out.println("Contains 20: " + s.contains(20));

        // Remove element
        s.remove(10);
        System.out.println("After removal: " + s);

        // HeadSet and TailSet
        System.out.println("HeadSet: " + s.headSet(30));
        System.out.println("TailSet: " + s.tailSet(30));

        // SubSet
        System.out.println("SubSet: " + s.subSet(20, 40));

        // Size
        System.out.println("Size: " + s.size());

        // Traversal
        System.out.print("Elements: ");
        for (int n : s) {
            System.out.print(n + " ");
        }
        System.out.println();

        // pollFirst() : removes and returns the smallest element
        System.out.println(s.pollFirst());
        System.out.println(s);
        
        // pollLast() : removes and returns the last element of the set
         System.out.println(s.pollLast());
        System.out.println(s);

        // Check empty
        System.out.println("\nIs empty: " + s.isEmpty());

        // Clear all elements
        s.clear();
        System.out.println("After clear: " + s);
    }
}
