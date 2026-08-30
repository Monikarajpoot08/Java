// Program to reverse a string 
import java.util.Scanner;
public class ReverseString {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String originalString = sc.nextLine();
        StringBuilder reversedString = new StringBuilder();
        for (int i = originalString.length()-1 ; i>=0 ; i--)
        {
            reversedString.append(originalString.charAt(i));
        }
        System.out.println("Reversed String is : " + reversedString);
        sc.close();
     }
}
