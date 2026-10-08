// 14.Write a Java program to demonstrate memory allocation for objects and the use of constructors.
class StudentInfo {
    String name;
    int age;
    StudentInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }}
public class MemoryAllocationDemo {
    public static void main(String[] args) {

        StudentInfo s1 = new StudentInfo("Risha", 20);
        StudentInfo s2 = new StudentInfo("priya", 22);

        s1.display();
        s2.display();
    }
}
