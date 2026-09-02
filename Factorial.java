// Program to find the factorial of a number
import java.util.Scanner;
public class Factorial {
     public static void main(String[] args) {
        int fact=1;
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i;
        for (i=n; i>0 ; i--){
            fact=fact*i;
        }
        System.out.println("Factorial: " + fact);

     }
}
