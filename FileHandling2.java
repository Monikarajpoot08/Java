//  reading data from file using FileOutputStream (Byte Stream Class method)
import java.io.*;

class FileHandling2 {
    public static void main(String[] args) {
        try {
            FileInputStream fin =
                new FileInputStream("Demo.txt");

            int i;

            while ((i = fin.read()) != -1) {
                System.out.print((char)i);
            }

            fin.close();
        }
        catch (IOException e) {
            System.out.println("File error");
        }
    }
}