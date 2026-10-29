import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorProgram {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("C");
        list.add("C++"); 
        list.add("Python");
        list.add("JavaScript");

        //getting listIterator
        ListIterator<String> ListIterator = list.listIterator();
        System.out.println("Forward Direction Iteration:  ");

        // for forward direction iteration : hasNext() , next()
        while(ListIterator.hasNext()) 
        {
             System.out.println(ListIterator.next());
        }
        
        System.out.println();
        System.out.println("Backward Direction Iteration: ");

        // for backward direction iteration: hasPrevious()  , previous()
        while(ListIterator.hasPrevious()){
            System.out.println(ListIterator.previous());
        }
     }
}
