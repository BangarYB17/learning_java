class priThread1 extends Thread{
    priThread1(String name , int priority){
        super(name);
        setPriority(priority);
    }
    public void run(){
         System.out.println(getName() + " With priority " + getPriority() + " is running."); 
    }
}
public class preemtive_ex {
    public static void main(String[] args) {
        priThread1 t1 = new priThread1("Thread 1", 3);
        priThread1 t2 = new priThread1("Thread 2", 7);
        priThread1 t3 = new priThread1("Thread 3", 5);
        priThread1 t4 = new priThread1("Thread 4", 7);
        priThread1 t5 = new priThread1("Thread 5", 2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
/*  usually higher priority thread run first but not guaranteed. 
    min priority 1 to 4
    normal priority 5
    high priority 6 to 10 
*/

