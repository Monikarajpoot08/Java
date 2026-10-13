//29.Write a Java program demonstrating the use of built-in packages such as java.lang and java.util.
import java.util.ArrayList;
public class PackageDemo {
    public static void main(String[] args) {
        // java.lang 
        String name = "anjali";
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("sqrt(144): " + Math.sqrt(144));
        // java.util
        ArrayList<String> list = new ArrayList<>();
        list.add("Fruit");
        list.add("Delhi");
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
    }}