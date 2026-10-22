import java.util.ArrayList;
import java.util.Collections;
public class ArrayListProgram{
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(88);
        list.add(1);
        list.add(47);

        // to access by index
        System.out.println(list.get(1));  
        System.out.println(list.get(2));

        // checks whether the element is present or not
        System.out.println(list.contains(47));  
        System.out.println(list.contains(20));


        // returns the size of the arraylist
        System.out.println(list.size());  
        

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        
        // remove index=2 value
        list.remove(2); 

        // remove by selecting the value in the list 
        // for string type list.remove("cherry"); will work but for integer type:
        list.remove(Integer.valueOf(1));
        System.out.println(list);


        list.add(2,70);   
        System.out.println(list);

        
        // updates at the index = 2 
        list.set(2,90);  
        System.out.println(list);

        // Sorting the arraylist
        Collections.sort(list);
        System.out.println(list); 
      }
}