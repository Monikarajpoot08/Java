/*Abstract class includes 
Abstract methods,Normal methods,Variables,Constructors,Common code*/

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
    void eat(){
         System.out.println("Dog eats");
    }
}

public class Abstract{
    public static void main(String[] args) {

        Animal a = new Dog(); // object of Abstract class can't be made directly
        // here class is Animal (abstract class) but the object is of Dog class

        a.sound();
        a.eat(); //dog eats (object is of Dog class which takes the reference of Animal class)
    }
}