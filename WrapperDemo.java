//32. Write a Java program demonstrating the use of wrapper classes such as Integer, Double, Character
//and Boolean.
public class WrapperDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer i = Integer.valueOf(a);    // boxing
        int a2 = i.intValue();           // unboxing
        System.out.println("Integer   : " + i + ", parsed from String: " + Integer.parseInt("50"));
        double d = 5.5;
        Double dObj = d;                     // autoboxing
        System.out.println("Double    : " + dObj + ", as int: " + dObj.intValue());
        char c = 'a';
        Character cObj = c;                  // autoboxing
        System.out.println("Character : " + cObj + ", uppercase: " + Character.toUpperCase(cObj)
                + ", isLetter: " + Character.isLetter(cObj));
        boolean b = true;
        Boolean bObj = b;                    // autoboxing
        System.out.println("Boolean   : " + bObj + ", parsed from String: " + Boolean.parseBoolean("false"));
    }}