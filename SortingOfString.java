// sorting the arraylist in ascending / descending order using lambda expression in java
import java.util.List;
import java.util.Arrays;

public class SortingOfString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple","date");
        // ascending order
        System.out.println("Ascending order: ");
        words.sort((a,b) -> a.length()- b.length());
        System.out.println(words);

        // Descending order
        System.out.println("Descending order: ");
        words.sort((a,b) -> b.length()- a.length());
        System.out.println(words);

        // for a integer type list 
        // words.sort((a,b) -> b - a); 
    }
    
}
