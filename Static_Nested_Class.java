// Nested static class uses static keyword 
// if the static keyword is used before declaring the inner class then it behaves like the top class
class Outer{
    static int number = 20;
    // int number=20; non static variable cannot be access to the Outer.Inner object
    static class Inner {

        void display() {
            System.out.println("Number = " + number);
        }
    }
}

public class Static_Nested_Class {
    public static void main(){
    Outer.Inner nestedInner = new Outer.Inner();
    nestedInner.display();
}

}
