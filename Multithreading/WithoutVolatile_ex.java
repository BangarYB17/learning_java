class sharedData{
    boolean flag = false;

}
public class WithoutVolatile_ex {
    public static void main(String[] args) {
        sharedData data = new sharedData();
        Thread writer = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            data.flag = true;
            System.out.println("Writer thread changed flag to true");
        });
        Thread reader = new Thread(()->{
            while(!data.flag){
              // waiting until flag becomes true
            }
            System.out.println("Reader thread saw flag =true");
        });
        writer.start();
        reader.start();
    }
}
/*problem here : sometimes reader thread may never see the change made by writer thread and may run indefinetely . this is because without 
volatile, there is no guarantee that the reader thread will see the updated value of flag. */
