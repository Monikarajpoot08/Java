//33. Write a Java program to demonstrate the basic concept of the Collection Framework.
import java.util.*;

class StudentCollection {
    public static void main(String[] args) { 
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(85);  // Adding elements
        marks.add(90);
        marks.add(75);
        System.out.println("Student Marks: " + marks);  // Displaying elements
        System.out.println("Contains 90: " + marks.contains(90));   // Searching an element
        marks.set(2, 80); // Updating an element
        System.out.println("After updating: " + marks);
        marks.remove(Integer.valueOf(85));   // Removing an element
        System.out.println("After removal: " + marks);
    }}
