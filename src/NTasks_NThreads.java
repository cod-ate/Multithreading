import java.lang.Runnable;

public class NTasks_NThreads
{
    public static void main(String[] args) {
        MyThread1 mt1= new MyThread1();
        MyThread2 mt2= new MyThread2();
        MyThread3 mt3= new MyThread3();

        Thread thread;

        thread= new Thread(mt1);
        thread.start();

        thread= new Thread(mt2);
        thread.start();

        thread= new Thread(mt3);
        thread.start();
    }

    static class MyThread1 implements Runnable {
        public void run() {
            System.out.println("MyThread-1");
        }
    }
    static class MyThread2 implements Runnable {
        public void run() {
            System.out.println("MyThread-2");
        }
    }
    static class MyThread3 implements Runnable {
        public void run() {
            System.out.println("MyThread-3");
        }
    }
}

