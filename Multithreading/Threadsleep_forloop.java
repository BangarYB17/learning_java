public class Threadsleep_forloop {
    public static void main(String[] args) {
        try {
            for(int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
