// Inner Class: it is a class that is defined inside another class and is not static
// The object of outer class should be made before making the object of inner class 

class Outer{
    class Inner{
        void display(){
            System.out.println("Inside Inner class ");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        // Creating obj of outer class
        Outer obj= new Outer();
        // Creating obj of inner class
        Outer.Inner  innerObj = obj.new Inner();
        innerObj.display();

    }
    
}
