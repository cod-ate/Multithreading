public class Thread_Daemon {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Executing main thread..");
        System.out.println("Is 'main' thread daemon?: "+Thread.currentThread().isDaemon()+"\n");
        Thread.sleep(100);

        /*
        main thread is the parent of Thread-0(t) and we are setting thread t as daemon thread
        so by default priority of daemon thread is less than its parent thread, therefore
        if the parent thread has completed its execution then jvm shuts down the execution of its
        daemon(child) thread ignoring its completion...
        so in order to execute daemon thread we can use sleep() or join() after start(), where
        join() is preferred
        */
        Test t= new Test();
        t.setDaemon(true);
        t.start();
        t.join();
    }

    static class Test extends Thread
    {
        public void run()
        {
            String name= Thread.currentThread().getName();
            System.out.println("Is '"+name+"' thread daemon?: "+Thread.currentThread().isDaemon());
            System.out.println("child thread");
        }
    }
}
