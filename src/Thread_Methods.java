public class Thread_Methods {
    public static void main(String[] args) throws Exception {
        changing_thread_name();

        MyThread mt= new MyThread("Obj-1");
        MyThread mt2= new MyThread("Obj-2");
        Thread th= new Thread(mt);
        th.start();
        th.setName("utsav");
        Thread.sleep(200);
        th= new Thread(mt2);
        th.start();
        th.setName("mathur");
    }
    public static void changing_thread_name() {
        System.out.println("Hello Java");
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        Thread.currentThread().setName("cod-ate");
        System.out.println("New Thread Name: "+Thread.currentThread().getName()+"\n");
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
