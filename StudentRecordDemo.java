import java.io.*;
import java.util.Scanner;

class StudentRecordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Writing student details into file
            FileWriter fw = new FileWriter("student.txt");

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            fw.write("Name: " + name + "\n");
            fw.write("Roll Number: " + roll + "\n");
            fw.write("Marks: " + marks + "\n");

            fw.close();

            // Reading student details from file
            FileReader fr = new FileReader("student.txt");

            int ch;
            System.out.println("\nStudent Record:");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        }
        catch (IOException e) {
            System.out.println("File error occurred");
        }

        sc.close();
    }
}