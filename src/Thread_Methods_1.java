public class Thread_Methods_1 {
    public static void main(String[] args) throws Exception {
        changing_thread_name();
        checkIsAlive();
        userDefinedThreads();
        checkIsAlive();
    }

    public static void changing_thread_name() {
        System.out.println("Hello Java");
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        Thread.currentThread().setName("cod-ate");
        System.out.println("New Thread Name: "+Thread.currentThread().getName()+"\n");
    }
    public static void checkIsAlive() {
        System.out.println("Thread '"+Thread.currentThread().getName()+
                "' is alive?: "+Thread.currentThread().isAlive()+"\n");
    }
    public static void userDefinedThreads() throws Exception {
        MyThread mt= new MyThread("Obj-1");
        MyThread mt2= new MyThread("Obj-2");

        Thread th;

        th= new Thread(mt);
        th.start();
        th.setName("utsav");
        System.out.println("Thread '"+th.getName()+"' is alive?: "+th.isAlive()+"\n");

        Thread.sleep(50);

        th= new Thread(mt2);
        th.start();
        th.setName("mathur");
        System.out.println("Thread '"+th.getName()+"' is alive?: "+th.isAlive()+"\n");
    }

    static class MyThread implements Runnable {
        String objName;
        MyThread(String objName) {
            this.objName= objName;
        }
        public void run() {
            System.out.println("class MyThread executing..");
            System.out.println("Thread name of obj '"+objName+"' is: " +
                    Thread.currentThread().getName()+"\n");
        }
    }
}
