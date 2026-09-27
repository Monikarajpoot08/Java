class NestedClassEg {

    int x = 10;

    // Nested class
    class Inner {

        void display() {
            System.out.println("Value of x = " + x);
        }
    }

    public static void main(String[] args) {

        // Create object of Outer class
        Outer obj1 = new Outer();

        // Create object of Inner class
        Outer.Inner obj2 = obj1.new Inner();

        obj2.display();
    }
}