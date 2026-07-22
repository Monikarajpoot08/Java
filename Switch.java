// Basic program of switch 
// import [java.util.*] makes all the classes in the java.util package available to the program.
// Importing java library [java.util.Scanner] to use scanner 
import java.util.Scanner;
public class Switch {
    public static void main(String[] args)
    {   System.out.println(" M-> Madras");
        System.out.println(" B-> Bengluru");
        System.out.println(" C-> Chandigarh");
        Scanner sc= new Scanner(System.in);
        System.out.println("Select your choice");
        char choice= sc.next().charAt(0);
        try {
            switch(choice)
            {
                case 'M': 
                case 'm': 
                System.out.println("Madras");
                break;

                case 'B': 
                case 'b': 
                System.out.println("Bengluru");
                break;

                case 'C': 
                case 'c': 
                System.out.println("Chandigarh");
                break;
                
                default:
                System.out.println("Invalid city");
            }
        }
        catch(Exception e)
        {    System.out.println("I/O error");
        }
        sc.close();
    }
}
