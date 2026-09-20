//Program to demonstrate object creation and usage
class StudentData {
    String name;
    int rollNo;
    int marks;
    void display(){
        System.out.println("Name: " +  name);
        System.out.println("RN: " +  rollNo);
        System.out.println("Marks: " +  marks);

    }
    void checkResult(){
        if(marks >= 40){
            System.out.println("Result: Pass " );
        }
        else{
            System.out.println("Result: FAIL " );
        }
    }
}

public class ObjectCreation {
    public static void main(String[] args) {
        StudentData s1= new StudentData();
        s1.name= "Anjali Rajpoot";
        s1.rollNo= 101;
        s1.marks= 88;
        s1.display();
        s1.checkResult();
    }
}
