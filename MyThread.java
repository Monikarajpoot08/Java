// Thread Concept in Java
// made thread of this class 
// and making it the entry point of the program (public static void main(String[] args) method)
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread state: RUNNING ");
        try{
            Thread.sleep(2000); // TIMED_WAITING state
        } catch (InterruptedException e) {
           System.out.println();
        }
    }
     public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println("Thread state: " + t1.getState());   // NEW state
        t1.start();
        System.out.println("Thread state: " + t1.getState());  // RUNNABLE state
        Thread.sleep(100); 
        System.out.println("Thread state now: " + t1.getState());  // RUNNING state
        t1.join(); // any method using join will wait for the thread to finish its execution  here main thread is waiting for t1 to finish its execution
        System.out.println("Thread state: " + t1.getState());  // TERMINATED state
    }
    
}
