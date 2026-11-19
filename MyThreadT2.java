// setPriority() Thread method 
public class MyThreadT2 extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        MyThreadT2 t1 = new MyThreadT2();
        MyThreadT2 t2 = new MyThreadT2();
        MyThreadT2 t3 = new MyThreadT2();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
