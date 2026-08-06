// Method overriding:subclass provide its own implementation of the method which is already provided by its superclass
// Run time polymorphism

class Organization{
    void work(){
        System.out.println("Organization works");
    }
    int salary=10000;
    void displaySalary(){
        System.out.println("Salary of employee is: "+salary);
    }
}

class Employee extends Organization{
    // child class overrides the work() method of parent class
    void work(){
        System.out.println("Employee works in the organization");
    }
    void leave(){
        System.out.println("Employee can take leave");
    }
}
public class MethodOverriding {
    public static void main(String [] args){
        Employee E= new Employee();
        E.work(); 
        E.displaySalary();
        E.leave();
    }
    
}
