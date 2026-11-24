// writing data into file using FileOutputStream (Byte Stream Class method)
import java.io.*;
class FileHandling1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout =
                new FileOutputStream("Demo.txt");

            String s = "Hello Monika how are you?";

            byte b[] = s.getBytes();

            fout.write(b);

            fout.close();

            System.out.println("Data written successfully");
        }
        catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}