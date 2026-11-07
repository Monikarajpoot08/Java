//Java program demonstrating the use of a nested try block.
class NestedTry {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");

            try {
                int a = 10;
                int b = 0;
                int c = a / b;

                System.out.println("Result: " + c);
            }
            catch (ArithmeticException e) {
                System.out.println("Division by zero is not allowed");
            }

            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        }

        System.out.println("Rest of the program");
    }
}
