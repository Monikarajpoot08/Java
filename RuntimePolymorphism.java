//25. Write a Java program demonstrating runtime polymorphism using method overriding.
class Shapes {
    void draw() {
        System.out.println("Drawing a shape");
    }}
class Circle extends Shapes {
    void draw() {
        System.out.println("Drawing a circle");
    }}
class Rectangle extends Shapes {
    void draw() {
        System.out.println("Drawing a rectangle");
    }}
class RuntimePolymorphism {
    public static void main(String[] args) {
        Shapes s;
        s = new Circle(); //A parent class reference variable can refer to an object of its child class in Java.
        // This is called upcasting and is commonly used in runtime polymorphism.
        s.draw();
        s = new Rectangle();
        s.draw();
    }}