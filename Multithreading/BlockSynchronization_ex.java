class Table {
    void printTable(int n) {
        System.out.println(Thread.currentThread().getName() +"Started");
        synchronized(this) {   // synchronized block
            for(int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(500);
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println(Thread.currentThread().getName() +"Completed");
    }
}

public class BlockSynchronization_ex{
    public static void main(String[] args) throws Exception {

        Table obj = new Table();

        // Lambda expression for thread
        Thread t1 = new Thread(() -> {
            obj.printTable(5);
        });
 
        Thread t2 = new Thread(() -> {
            obj.printTable(10);
        });

        t1.start();
        t1.join();
        t2.start();
    }
}
