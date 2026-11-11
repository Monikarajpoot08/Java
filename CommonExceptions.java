//  ArithmeticException,ArrayIndexOutOfBoundsException, NumberFormatException and NullPointerException.
class CommonExceptions {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;        // ArithmeticException
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception"); }
        try {                        // ArrayIndexOutOfBoundsException
            int arr[] = {10, 20, 30}; 
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");}
        try {                  // NumberFormatException
            int n = Integer.parseInt("Hello");
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception");}
        try {                  // NullPointerException
            String str = null;
            System.out.println(str.length());}
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }}}