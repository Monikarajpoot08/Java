// Static nested class: A static nested class in java is a class defined inside another class and marked as static
// The scope of static nested class is not bounded by the scope of its encloding class

class Person{
    static String name= "Monika";
    // static nested class
    static  class PersonInner{
        void getInnerDetails(){
            System.out.println("Inner Function Called ");
        }
    }
}

public class StaticNestedClass {
       public static void main(String[] args) {
        // Creating inner class object without using outer class
        Person.PersonInner pInner= new Person.PersonInner();
        pInner.getInnerDetails();
       }
}
