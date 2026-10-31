// Vector containing a collection (list, ArrayList, vector)
import java.util.*;
public class VectorProgram {
    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(40);
    list.add(80);
    list.add(120);

    Vector<Integer> v = new Vector<>(list);
    System.out.println(v);

    // printing by for loop 
    for (int i=0; i<v.size() ; i++){
        System.out.println(v.get(i));
    }
}}
