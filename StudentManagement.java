// Create a student management system using classes and objects.
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks;

    void addStudent(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String n = sc.nextLine();
        System.out.print("Enter Marks: ");
        int m = sc.nextInt();
        s1.addStudent(r, n, m);
        System.out.println("\nStudent Details:");
        s1.displayStudent();
        sc.close();
    }
}
