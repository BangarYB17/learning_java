class myTask1 implements Runnable{
     @Override
     public void run() {
         System.out.println("Thread using runnable interface....");
     }
} 
public class Runnable_interface {
    public static void main(String[] args) {
        //step1: create runnable object.

        myTask1 task = new myTask1();
        /* or 
        Runnable task = new myTask1();   (Dynamic dispatch) */
        
        Thread t1 =new Thread(task,"FCT Thread");
        t1.start();

        System.out.println(t1.getName());
    }
}
