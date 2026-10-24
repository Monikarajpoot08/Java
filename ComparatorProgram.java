// Comparator compares the object of the same type and determines their order
// if o1 - o2 = -ve then o2 comes before o1
// if o1 - o2 = +ve then o1 comes before o2
// if o1 - o2 = 0 then o1 and o2 are equal

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class MyComparator implements Comparator<Integer> {
    @Override 
    public int compare(Integer o1, Integer o2) {
        return o1 - o2; // ascending order
        // return o2 - o1; // descending order
    }
}

public class ComparatorProgram {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(90);
        list.add(30);
        list.add(55);
        
        list.sort(new MyComparator());
        System.out.println(list);
    }
}
