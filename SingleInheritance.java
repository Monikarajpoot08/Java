// Program of Single Inheritance
class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void sleep(){
        System.out.println("Dog sleeps");
    }
    void bark(){
        System.out.println("Dog barks");
    }
}
public class SingleInheritance {
    public static void main(String[] args){
        Dog d1 = new Dog(); // object created from Dog class
        d1.eat(); // Dog class inherits the methods from Animal class
        d1.sleep();
        d1.bark();
    }
}
