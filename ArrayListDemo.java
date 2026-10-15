//34. Write a Java program using ArrayList to store, display, search, update and delete elements.
import java.util.ArrayList;
import java.util.Scanner;
class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add("Cricket");
        list.add("Badminton");
        list.add("Tennis");
        System.out.println("Elements: " + list); // Display elements
        System.out.print("Enter element to search: ");
        String search = sc.nextLine();  // Search an element
        if (list.contains(search))
            System.out.println("Element found");
        else
            System.out.println("Element not found");
        list.set(1, "Football"); // Update an element
        System.out.println("After updating: " + list);
        list.remove("Tennis");  // Delete an element
        System.out.println("After deleting: " + list);
        sc.close();}}
