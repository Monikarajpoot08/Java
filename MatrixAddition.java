// Program to add two matrices of size 3x3
import java.util.Scanner;
public class MatrixAddition {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int[][] a = new int[3][3];
            int[][] b = new int[3][3];
            System.out.println("Enter elements of first matrix:");
            for(int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    a[i][j]= sc.nextInt();
                }
            }
            System.out.println("Enter elements of second matrix:");
             for(int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    b[i][j]= sc.nextInt();
                }
            }

            int[][] c = new int[3][3];
            for(int i=0; i<3; i++){
                for (int j=0; j<3; j++)
                {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("Resultant matrix after addition:");
            // Displaying the resultant matrix
            for(int i=0; i<3; i++){
                for (int j=0; j<3; j++)
                {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
}
