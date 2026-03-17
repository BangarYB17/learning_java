class MyTask extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread is running....");
        }
        else{
            System.out.println("User Thread is running....");
        }
    }
}
public class DaemonThread_ex {
    public static void main(String[] args) {
        MyTask t1 = new MyTask();
        MyTask t2 = new MyTask();

        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}
