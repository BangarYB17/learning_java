class Task extends Thread{
    public void run(){
      System.out.println(Thread.currentThread().getName()+"started");
      try{
        Thread.sleep(500);
      }catch(Exception e){
 
      }
    System.out.println(Thread.currentThread().getName()+"Finished");
    }
}
public class Threadjoin2 {
    public static void main(String[] args) throws Exception {
       Task t1 = new Task();
       Thread th1 = new Thread(t1,"FCT 1");
       Task t2 =new Task();

       th1.start();
       th1.join();
       t1.start();
       t1.join();
       t2.start();
       t2.join();

       System.out.println("Main completed");

    }
}
