// StringBuffer class in java
class StringBufferExample {
    public static void main(String[] args) {

        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Display original string
        System.out.println("Original: " + sb);

        // append() - adds text at the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert() - inserts text at a particular position
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // replace() - replaces characters
        sb.replace(6, 10, "Programming");
        System.out.println("After replace: " + sb);

        // delete() - removes characters
        sb.delete(0, 6);
        System.out.println("After delete: " + sb);

        // reverse() - reverses the StringBuffer
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}