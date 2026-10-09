//19. Write a Java program to demonstrate hierarchical inheritance.
class College {
    void collegeName() {
        System.out.println("College name is ABC");
    }}
class Management extends College {
    void management() {
        System.out.println("College management is great");
    }}
class Accountant extends College {
    void budget() {
        System.out.println("Budgets are managed by accountant");
    }}
public class HierarchialInheritance {
    public static void main(String[] args) {
        Management m = new Management();
        Accountant a = new Accountant();
        m.collegeName();
        m.management();
        a.collegeName();
        a.budget();}}
