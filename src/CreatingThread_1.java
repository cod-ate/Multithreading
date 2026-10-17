// This is 1-st way of creating Thread i.e; by extending in-built Thread class
/*
For real-world problems this way is not preferred because java does not support
multiple inheritance
*/

import java.lang.Thread;

public class CreatingThread_1 {
    public static void main(String[] args) {
        Test t1= new Test(1);
        t1.start(); // start() is being called which internally calls run()
        Test t2= new Test(2);
        t2.start(); // start() makes the Thread runnable then run() runs the Thread
        Test t3= new Test(3);
        t3.start();
        Test t4 = new Test(4);
        t4.start();
    }

    static class Test extends Thread {
        int i;
        Test(int i) {
            this.i= i;
        }

        public void run() {
            // This method contains tasks to be executed by Thread
            System.out.println("Thread: "+i);
        }
    }
}