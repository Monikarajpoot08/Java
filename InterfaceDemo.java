//21. Write a Java program to demonstrate multiple inheritance through interfaces.
interface Payment {
    void pay();}
interface Bank{
    void bank_name();}
class UPI implements Payment, Bank {
    public void pay() {
        System.out.println("Payment made through UPI");
    }
    public void bank_name(){
        System.out.println("Bank name: BOB");
    }
    public void work(){
        System.out.println("UPI works");
    }}
public class InterfaceDemo {
       public static void main(String[] args) {
        UPI u = new UPI();
        u.pay();
        u.work();
        u.bank_name(); 
    }}
