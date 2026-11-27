// Java program to demonstrate FileReader class: Character Stream class method
import java.io.*;
class FileHandling4 {
    public static void main(String[] args) {
        try {
            FileReader fr =
                new FileReader("DemoFile.txt");

            int i;

            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
            }

            fr.close();
        }
        catch (IOException e) {
            System.out.println("File error");
        }
    }
}