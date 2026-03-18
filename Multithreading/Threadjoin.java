class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread: "+i);
            try {
                Thread.sleep(500);  // half second delay 
                // System.out.println(i/0);    // divide by zero exception
            } catch (Exception e) {
                e.printStackTrace();     //prints exception if any occured. 
            }
        }
    }
}
public class Threadjoin{
    public static void main(String[] args) throws InterruptedException{
        MyThread t1 = new MyThread();
        // MyThread t2 = new MyThread();
        t1.start();
        t1.join(500);  // main thread wait here
        // t2.start();
        // t2.join();
        
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread: "+i);
        }
    }
}