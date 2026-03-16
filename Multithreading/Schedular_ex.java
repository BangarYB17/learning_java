class SchThread extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+" Running....");
        }
    }
}
public class Schedular_ex {
    public static void main(String[] args) {
        SchThread t1 = new SchThread();
        SchThread t2 = new SchThread();

        t1.start();
        t2.start();
    }
}
/* why output changes everytime??
  - because thread schedular decides which thread runs first.
 */
