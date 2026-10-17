// This is 2-nd way of creating Thread i.e; by implementing in-built Runnable interface

import java.lang.Runnable;

public class CreatingThread_2 {

    public static void main(String[] args) {
        Test t1= new Test(1);
        Thread th= new Thread(t1);
        th.start();

        Test t2= new Test(2);
        th= new Thread(t2);
        th.start();

        Test t3= new Test(3);
        th= new Thread(t3);
        th.start();

        Test t4= new Test(4);
        th= new Thread(t4);
        th.start();
    }

    static class Test implements Runnable {
        int i;
        Test(int i) {
            this.i= i;
        }

        public void run() {
            System.out.println("Thread: "+i);
        }
    }
}