import java.util.Scanner;
class Sum {

    
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = add(a, b);

        System.out.println("Sum = " + result);
    }
}










