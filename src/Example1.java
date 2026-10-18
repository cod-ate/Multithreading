public class Example1 {
    public static void main(String[] args) throws InterruptedException{
        Factorial factorial= new Factorial(5);
        Fibonacci fibonacci= new Fibonacci(7);
        int[] arr= {2,3,6,7,9,10,23,45,68};
        int key= 20;
        BinarySearch binarySearch= new BinarySearch(arr, key);

        Thread thread;

        thread= new Thread(factorial);
        thread.start();
        Thread.sleep(10);

        thread= new Thread(fibonacci);
        thread.start();
        Thread.sleep(10);

        thread= new Thread(binarySearch);
        thread.start();
    }

    static class Factorial implements Runnable {
        int n;
        Factorial(int n) {
            this.n= n;
        }
        public void run() {
            int fact= 1;
            for(int i=1; i<=n; i++)
                fact *= i;
            System.out.println("Factorial of "+n+": "+fact);
            System.out.println("-------------");
        }
    }

    static class Fibonacci implements Runnable {
        int n, a= 0, b= 1;
        Fibonacci(int n) {
            this.n= n;
        }
        public void run() {
            System.out.print("Fibonacci series: ");
            if(n==1)
                System.out.print(a);
            else if(n==2)
                System.out.print(a+" "+b);
            else {
                System.out.print(a+" "+b+" ");
                for(int i= 3; i<=n; i++) {
                    int c= a+b;
                    System.out.print(c+" ");
                    a= b;
                    b= c;
                }
            }
            System.out.println("\n-------------");
        }
    }

    static class BinarySearch implements Runnable {
        int[] arr;
        int key;
        BinarySearch(int[] arr, int key) {
            this.arr= arr;
            this.key= key;
        }
        public void run() {
            int low= 0, high= arr.length-1;
            while(low<=high) {
                int mid= (low+high)/2;
                if(arr[mid]==key)
                {
                    System.out.println("Key found at idx: "+mid);
                    return;
                }
                else if(key<arr[mid])
                    high= mid-1;
                else
                    low= mid+1;
            }
            System.out.println("Key not found!");
        }
    }
}
