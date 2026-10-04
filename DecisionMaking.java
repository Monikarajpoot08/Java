//5. Write Java programs to demonstrate decision-making statements: if, if-else, nested if, and switch.
public class DecisionMaking {
    public static void main(String[] args) {
        int age = 20,marks = 75,num = 10,day = 2;
        // if
        if (age >= 18)
            System.out.println("Eligible to vote");
        // if-else
        if (num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
        // Nested if
        if (age >= 18) {
            if (marks >= 50)
                System.out.println("Pass");}
        // switch
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day");
        }}}