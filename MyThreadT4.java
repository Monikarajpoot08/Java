// yield() method in Thread
public class MyThreadT4 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);

            Thread.yield();
        }
    }

    public static void main(String[] args) {

        MyThreadT4 t1 = new MyThreadT4();
        MyThreadT4 t2 = new MyThreadT4();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
