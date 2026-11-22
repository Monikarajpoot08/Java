// interrupt() method in Thread
public class MyThreadT3  extends Thread {
    @Override
    public void run() {
      try{
        Thread.sleep(1000);
        System.out.println("Thread is running");
      } catch (InterruptedException e) {
        System.out.println("Thread was interrupted" + e);
      }
    }
     public static void main(String[] args) {
        MyThreadT3 t1 = new MyThreadT3();
        t1.start();
        t1.interrupt();
    }

    
}
