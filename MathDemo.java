//30. Write a Java program using the Math class to perform mathematical operations such as power, 
// square, root, maximum, minimum and rounding.
public class MathDemo {
    public static void main(String[] args) {
        System.out.println("Power (2^5)    : " + Math.pow(2, 5));
        System.out.println("Square root    : " + Math.sqrt(81));
        System.out.println("Maximum        : " + Math.max(30, 40));
        System.out.println("Minimum        : " + Math.min(15, 50));
        System.out.println("Round (4.6)    : " + Math.round(4.6));
        System.out.println("Ceil  (4.2)    : " + Math.ceil(4.7));
        System.out.println("Floor (4.9)    : " + Math.floor(4.9));
        System.out.println("Absolute (-56)  : " + Math.abs(-56));
    }}