//44.Develop a simple student record management program using ArrayList, storing roll number, name and marks
import java.util.*;
class Student {
    int rollNo;
    String name;
    int marks;
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    void display() {
        System.out.println(rollNo + "  " + name + "  " + marks);
    }}
class StudentRecord {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Monika", 85));
        list.add(new Student(2, "Rishita", 90));
        list.add(new Student(3, "anjali", 78));

        System.out.println("Roll No  Name  Marks");
        for (Student s : list) {
            s.display();
        }}}