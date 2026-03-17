public class Threadsleep_ex{
    public static void main(String[]args){
        try {
            System.out.println("Program Started...");
            Thread.sleep(5000); // 5 seconds delay.
            System.out.println("Program Resumed after 5 seconds");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}