class MyThread extends Thread{
    MyThread(ThreadGroup tg,String name){
        super(tg,name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadGroup_ex{
   public static void main(String[] args) {
    ThreadGroup tg = new ThreadGroup("My Group");

    MyThread t1 = new MyThread(tg, "Thread-1");
    MyThread t2 = new MyThread(tg, "Thread-2");

    t1.start();
    t2.start();
    
    System.out.println("Active Threads:" +tg.activeCount());
   } 
}