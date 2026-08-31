// Program to print table from 10 to 20 using TWO-DIMENSIONAL ARRAY
public class MultiplicationTable {
    public static void main(String[] args) {
        int colStart=10, colEnd=20;
        int rowStart=1, rowEnd=10;
        // Total number of column
        int numCols= colEnd - colStart +1;
        // Total number of rows
        int numRows= rowEnd - rowStart +1;
        int [][] table= new int [numRows][numCols];
        // colNumber * multiplier
        for (int i=0; i< numRows; i++){
            for (int j=0; j< numCols; j++)
            {
                int colNumber= colStart +j;
                int multiplier= rowStart+ i;
                table[i][j] = colNumber * multiplier;
            }
        }
       // Printind table
       for (int i=0; i <numRows; i++){
        for (int j= 0; j < numCols; j++)
        {   //printf: This prints the number left-aligned in a 6-character slot
            System.out.printf("%-6d", table[i][j]);
        }
        System.out.println();
       }
    }
}
