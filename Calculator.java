public class Calculator 
{
    public static void main (String args[])
    {
        // command line argument
        //to run this code you must provide arguments after  the class is created
        int a= Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("addition= " + (a+b));
        System.out.println("subtraction= " + (a-b));
        System.out.println("Division= " + (a/b));
        System.out.println("Multiplication= " + (a*b));
    }

}