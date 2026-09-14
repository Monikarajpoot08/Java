interface Shape {
    void area();
}

class Circle implements Shape {
    public void area() {
        System.out.println("Area of Circle = π *r* r");
    }
}

class Rectangle implements Shape {
    public void area() {
        System.out.println("Area of Rectangle = length * breadth");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();

        Rectangle r = new Rectangle();
        r.area();
    }
}