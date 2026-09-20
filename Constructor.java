// Program to demonstrate constructor overloading
// Constructor overloading: means having multiple constructors in the same class with different parameter lists
class Employee{
    int id;
    String name;
    double salary;

    // default constructor
    Employee(){
        id=0;
        name="unknown";
        salary=0.0;;
    }

    // Parameterized constructor with two parameters
    Employee(int ID, String Name){
        id= ID;
        name=Name;
        salary=0.0;
    }

    //Parameterized constructor with three parameters
    Employee(int ID, String Name, double Salary){
        id= ID;
        name= Name;
        salary= Salary;
    }

    // Display function
    void display(){
        System.out.println("Employee ID:  " + id);
         System.out.println("name:  " + name);
          System.out.println("Salary:  " + salary);
    }
}
public class Constructor {
    public static void main(String [] args){
        // Calling default Constructor
        Employee e1 = new Employee();
        // Calling parameterized 
          Employee e2 = new Employee(11, "Monika ");
          Employee e3 = new Employee(12, "Anjali ", 100000);
          e1.display();
          e2.display();
          e3.display();
    }   
}
