//Multiplication of multiple numbers using method overloading
// Method overloading: process of defining multiple methods with the same name but different parameters in the same class.
// Compile time polymorphism 
class Multiplication{
    int multiply(int a , int b){
        return a*b;
    }
    int multiply(int a , int b , int c){
        return a*b*c;
    }
    int multiply(int a , int b , int c , int d){
        return a*b*c*d;
    }
}
  
public class MethodOverloading {
    public static void main(String [] args){
        Multiplication m1=new Multiplication();
        System.out.println(m1.multiply(6,3));
        System.out.println(m1.multiply(2,3,7));
        System.out.println(m1.multiply(2,3,8,5));
     }
    
}
