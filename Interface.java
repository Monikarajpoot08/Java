/*Interface class:Interface in Java is a contract that contains method declarations which a class must implement.
 It is used to achieve abstraction and supports multiple inheritance.*/
interface Payment {

    void pay(); // this method should be defined by the class which implements interface class(Payment)
}

interface Bank{
    void bank_name();
}

// Multiple inheritance is possible through interface class
class UPI implements Payment, Bank {

    public void pay() {
        System.out.println("Payment made through UPI");
    }
    public void bank_name(){
        System.out.println("Bank name: BOB");
    }
    void work(){
        System.out.println("UPI works");
    }
}

class CreditCard implements Payment {

    public void pay() {
        System.out.println("Payment made through Credit Card");
    }
}

class Cash implements Payment {

    public void pay() {
        System.out.println("Payment made through Cash");
    }
}

public class Interface {

    public static void main(String[] args) {

        UPI u = new UPI();
        u.pay();
        u.work();
        u.bank_name();

        CreditCard c = new CreditCard();
        c.pay();

        Cash cash = new Cash();
        cash.pay();
    }
}
