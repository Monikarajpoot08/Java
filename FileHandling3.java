// Java program to demonstrate the use of FileWriter class : Character Stream class method
import java.io.*;
class FileHandling3 {
    public static void main(String[] args) {
        try {
            FileWriter fw =
                new FileWriter("DemoFile.txt");

            fw.write("Name: monika");
            fw.write("\nRoll No: 101");
            fw.write("\nCourse: c++");

            fw.close();

            System.out.println("Data written successfully");
        }
        catch (IOException e) {
            System.out.println("File error");
        }
    }
}