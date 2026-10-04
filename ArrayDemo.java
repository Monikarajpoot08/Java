//7. Write a Java program to create and manipulate a one-dimensional array, including finding the largest,
//smallest and average element.
public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {10, 80, 5, 40, 15};
        int largest = a[0], smallest = a[0], sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest)
                largest = a[i];
            if (a[i] < smallest)
                smallest = a[i];
                sum += a[i];
          }

        double average = (double) sum / a.length;
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Average: " + average);
    }}