class MyThread extends Thread{
    public void run(){
       try{
            for(int i=1;i<=5;i++){
                System.out.println("Thread Running: "+i);
                Thread.sleep(1000);
            }
       }
       catch(InterruptedException e){
           System.out.println(e);
       }
    }
}

public class sleep_with_thread_ex{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread t1 = new MyThread();
        t.start();
        t1.start(); // first time start
       /* t1.start() secon time error*/ 
       // we can do it using creating another object.
    }
}