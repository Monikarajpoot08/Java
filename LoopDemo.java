//6. Write Java programs to demonstrate looping statements: for, while, and do-while.
public class LoopDemo {
    public static void main(String[] args) {

        // for loop
        for (int i = 1; i <= 5; i++)
            System.out.print(i + " ");
            System.out.println();
        // while loop
        int i = 5;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        // do-while loop
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
    }}