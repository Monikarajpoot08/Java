// Comparator compares the object of the same type and determines their order
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class StringLengthComparator implements Comparator<String> {
    @Override 
    public int compare(String o1, String o2) {
        return o1.length() - o2.length(); // ascending order by length
        //return o2.length() - o1.length(); // descending order by length
    }
}

public class CompareStrings {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("lion");
        list.add("cat");
        list.add("elephant");
        list.add("horse");
        
        list.sort(new StringLengthComparator());
        System.out.println(list);
    }
}
