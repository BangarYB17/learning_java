class sharedData{
    volatile boolean flag = false;

}
public class Volatile_ex {
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

            }
            System.out.println("Reader thread saw flag =true");
        });
        writer.start();
        reader.start();
    }
}
