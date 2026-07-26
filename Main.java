//Basic program to print name and age of a student using class and object (oops concept)
class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Monika";
        s1.age = 20;

        s1.display();
    }
}