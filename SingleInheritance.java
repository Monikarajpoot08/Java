//17.Write a Java program to demonstrate single/simple inheritance.
class Organization{
    void work(){
        System.out.println("Organization works");
    }}
class Manager extends Organization{
    void projects(){
        System.out.println("Manager manages projects");
    }
    void deadlines(){
        System.out.println("Manager handles deadlines");
    }}
public class SingleInheritance {
    public static void main(String[] args){
        Manager m1 = new Manager();
        m1.work(); 
        m1.projects();
        m1.deadlines();
    }}
