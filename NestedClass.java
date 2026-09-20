// Nested class: when a class is defined in another class.
// The scope of nested class is bounded by the scope of its encloding class .Means that nested class is created and called in its enclosing class.
class College{
    class Student{
        void getStudentDetails(){
            System.out.println("Student details! ");
        }
    }
    void getCollegeDetails(){
        // Student object is created within outer class : College
        Student s1= new Student();
        s1.getStudentDetails();
    }
}


public class NestedClass {
      public static void main(String[] args) {
        College c1= new College();
        // Nested class method is called using Outer class 
        c1.getCollegeDetails();
      }
}
