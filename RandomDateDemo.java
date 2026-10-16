//31. Write a Java program using Random and Date classes from the java.util package.
import java.util.Random;
import java.util.Date;
class RandomDateDemo {
    public static void main(String[] args) {
        Random r = new Random();
        // Generating random numbers
        System.out.println("Random number: " + r.nextInt(100));
        System.out.println("Random floating point no.: " + r.nextFloat());
        // Displaying current date and time
        Date d = new Date();
        System.out.println("Current Date and Time: " + d);
    }}
