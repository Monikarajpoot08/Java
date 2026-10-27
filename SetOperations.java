
import java.util.*;

class SetOperations {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);

        Set<Integer> s2 = new HashSet<>();
        s2.add(30);
        s2.add(40);
        s2.add(50);

        System.out.println("Set 1: " + s1);
        System.out.println("Set 2: " + s2);

        // 1. Remove an element
        s1.remove(10);
        System.out.println("After removal: " + s1);

        // 2. Search an element
        System.out.println("Contains 20: " + s1.contains(20));

        // 3. Find size
        System.out.println("Size: " + s1.size());

        // 4. Union
        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println("Union: " + union);

        // 5. Intersection
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println("Intersection: " + intersection);

        // 6. Difference (s1 - s2)
        Set<Integer> difference = new HashSet<>(s1);
        difference.removeAll(s2);
        System.out.println("Difference: " + difference);

        // 7. Traverse the Set
        System.out.print("Elements: ");
        for (int n : s1) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 8. Check empty
        System.out.println("Is empty: " + s1.isEmpty());

        // 9. Clear all elements
        s1.clear();
        System.out.println("After clearing: " + s1);
    }
}
