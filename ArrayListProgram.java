import java.util.ArrayList;
public class ArrayListProgram{
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(80);
        System.out.println(list.get(1));  // to access by index
        System.out.println(list.get(2));
        System.out.println(list.contains(5));  // checks whether the element is present or not
        System.out.println(list.contains(20));
        System.out.println(list.size());  // returns the size of the arraylist
        // loop 
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        // another way to print arraylist

        /*  for (int x:list ){
            System.err.println(x);
        } */

        list.remove(2); // remove index=2 value
        System.out.println(list);
        list.add(2,70);   
        System.out.println(list);
        list.set(2,88);  // updates at the index = 2 
    }
}