// This is 1-st way of creating Thread i.e; by extending in-built Thread class
/*
For real-world problems this way is not preferred because java does not support
multiple inheritance
*/
import java.lang.Thread;

public class CreatingThread_1 {
    public static void main(String[] args){
        Test t1= new Test(1);
        t1.start(); // start() is being called which internally calls run()
        Test t2= new Test(2);
        t2.start(); // start() makes the Thread runnable then run() runs the Thread
        Test t3= new Test(3);
        t3.start();
        Test t4 = new Test(4);
        t4.start();
    }
}

class Test extends Thread{
    int i;
    Test(int i)
    {
        this.i= i;
    }

    public void run()
    {
        // This method contains tasks to be executed by Thread
        System.out.println("Thread: "+i);
    }
}

/*
Most Used Methods of Java Thread Class:
1. start() – Starts a new thread.
2. run() – Defines the task executed by a thread.
3. sleep(long millis) – Pauses the current thread for a specified time.
4. join() – Waits for a thread to finish.
5. currentThread() – Returns the currently executing thread.
6. getName() – Returns the thread's name.
7. setName(String name) – Sets the thread's name.
8. getPriority() – Returns the thread's priority.
9. setPriority(int priority) – Sets the thread's priority.
10. isAlive() – Checks whether a thread is still alive.
11. interrupt() – Interrupts a thread or signals it to respond to interruption.
12. isInterrupted() – Checks whether a thread has been interrupted.
13. interrupted() – Checks and clears the current thread's interrupted status.
14. yield() – Hints that the current thread can allow other threads to execute.
15. setDaemon(boolean on) – Sets a thread as a daemon thread before it starts.
16. isDaemon() – Checks whether a thread is a daemon thread.
17. getState() – Returns the current state of a thread.
18. threadId() – Returns the thread's ID in modern Java.
*/