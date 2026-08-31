// Program to display name,age,rollnumber,course of a student using Command Line Arguments
public class MainClass {
    public static void main(String[] args)
    {   String name = args[0];
        int age = Integer.parseInt(args[1]);
        int rollNumber = Integer.parseInt(args[2]);
        String course = args[3];
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
   }
    
}
