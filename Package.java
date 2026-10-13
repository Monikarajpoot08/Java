//28.Create a user-defined package containing a class and access that class from another Java program.
import mypack.Message;

class Package {
    public static void main(String[] args) {
        Message obj = new Message();
        obj.display();
    }
}