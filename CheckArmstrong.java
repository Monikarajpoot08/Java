// Program to check whether a number is armstrong or not
import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        int r=0, sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter a number =  ");
        int n =  sc.nextInt();
        int original=n;
        while (n!=0)
        {
           r = n%10;
           // final sum will store in this variable
           sum = sum+  r*r*r;
           n = n/10;
        }
        if ( original== sum){
            System.out.println("The number " + original +" is armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
        sc.close();
    }
}
