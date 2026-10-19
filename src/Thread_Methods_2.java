public class Thread_Methods_2 {
    public static void main(String[] args) {
        Test1 t1= new Test1();
        Test2 t2= new Test2();
        Test3 t3= new Test3();
        Test4 t4= new Test4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    static class Test1 extends Thread {
        public void run() {
            Thread.yield();
            System.out.println(Thread.currentThread().getName());
        }
    }
    static class Test2 extends Thread {
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
    static class Test3 extends Thread {
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
    static class Test4 extends Thread {
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
