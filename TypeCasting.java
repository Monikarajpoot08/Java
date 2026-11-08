// 11. Write a Java program to demonstrate type casting between primitive data types.
public class TypeCasting {
    public static void main(String[] args) {

        // Widening casting
        int a = 88;
        double b = a;

        // Narrowing casting
        double x = 10.58098;
        int y = (int) x;

        System.out.println("Widening: " + b);
        System.out.println("Narrowing: " + y);
    }
}