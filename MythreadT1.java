// join() method in Thread
class MythreadT1 extends Thread {
    
    @Override
    public void run() {
        try {
            Thread.sleep(5000);  // sleeps for 5 seconds
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {

        MythreadT1 t1 = new MythreadT1();
        
        t1.start();
        t1.join(); // main thread will wait until t1 thread completes its execution

        System.out.println("Hello Java");
    }
}
