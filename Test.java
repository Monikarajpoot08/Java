//exception handling 
//User defined
class Test {
    public static void main(String[] args) {
        try{
            int a=10/5;
            System.out.println(a);
        }
        catch (ArithmeticException e)  {

            System.out.println(" Division by 0 is not allowed");
        }
    }
}