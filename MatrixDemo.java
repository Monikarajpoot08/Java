// 8.Write a Java program to perform addition and multiplication of two-dimensional matrices.
public class MatrixDemo {
    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];
        int[][] mul = new int[2][2];
        for (int i = 0; i < 2; i++) {          // Addition
            for (int j = 0; j < 2; j++) {
                sum[i][j] = A[i][j] + B[i][j];}}
        for (int i = 0; i < 2; i++) {         // Multiplication
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    mul[i][j] += A[i][k] * B[k][j];}}}
       System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {for (int j = 0; j < 2; j++)
            System.out.print(sum[i][j] + " ");
            System.out.println();}
        System.out.println("Multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
            System.out.print(mul[i][j] + " "); System.out.println();}}}