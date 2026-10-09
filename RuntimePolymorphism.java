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
        s = new Circle();
        s.draw();
        s = new Rectangle();
        s.draw();
    }}