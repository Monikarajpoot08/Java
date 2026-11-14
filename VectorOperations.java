
import java.util.Vector;
import java.util.Scanner;

class VectorOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<Integer> marks = new Vector<>();

        System.out.println("Enter 5 student marks:");

        for (int i = 0; i < 5; i++) {
            marks.add(sc.nextInt());
        }

        System.out.println("Student Marks: " + marks);

        // Find highest marks
        int max = marks.get(0);

        for (int m : marks) {
            if (m > max) {
                max = m;
            }
        }

        System.out.println("Highest Marks: " + max);

        // Find lowest marks
        int min = marks.get(0);

        for (int m : marks) {
            if (m < min) {
                min = m;
            }
        }

        System.out.println("Lowest Marks: " + min);

        // Calculate total
        int sum = 0;

        for (int m : marks) {
            sum = sum + m;
        }

        System.out.println("Total Marks: " + sum);
        System.out.println("Average: " + (sum / 5.0));

        sc.close();
    }
}
