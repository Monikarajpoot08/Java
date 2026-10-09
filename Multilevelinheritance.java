// 18. Write a Java program to demonstrate multilevel inheritance using three classes.
class College{
    void collegeName(){
        System.out.println("College name is ABC");
    }}
class Management extends College{
    void management(){
        System.out.println("College management is great");
    }}
class Accountant extends Management{
    void budget(){
        System.out.println("Budgets are managed by accountant");
    }}
public class Multilevelinheritance {
    public static void main(String[] args) {
        Accountant a = new Accountant();
        a.collegeName();
        a.management();
        a.budget();
    }}
