/*
Priority values ranges from 1 to 10, higher the value higher is the priority
out of this range will throw runtime exception(IllegalArgumentException)
By default priority is set to 5; main thread's priority is 5 and so its child thread
follows the same, but we can manipulate priority values using setPriority() for any thread

Priority concept depends upon the platform and windows does not support priority system
*/

public class Thread_Priority {
    public static void main(String[] args) {
        Test t1= new Test(100);
        Test t2= new Test(200);
        Test t3= new Test(300);

        Thread thread;

        thread= new Thread(t1);
        thread.setPriority(3);
        thread.start();

        thread= new Thread(t2);
        thread.setPriority(7);
        thread.start();

        thread= new Thread(t3);
        thread.setPriority(10);
        thread.start();
    }

    static class Test implements Runnable {
        int i;
        Test(int i) {
            this.i= i;
        }
        public void run() {
            System.out.println("Hello "+i);
            System.out.println(Thread.currentThread().getPriority());
        }
    }
}
