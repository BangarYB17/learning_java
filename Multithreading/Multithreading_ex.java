class FctThread extends Thread{
    public void run(){
        System.out.println("FCT Thread is running.....");
    }
}

public class Multithreading_ex{
    public static void main(String[] args) {
        FctThread t1 = new FctThread(); // the following example shows how to create custom thread
        t1.start();    // start() creates new thread and run() contain  multiple tasks that thread executes.

        Thread t2 = new Thread();
        t2.start();

        Thread t3 = new Thread("FctThread2");
        System.out.println(t3.getName());
        
    }
}