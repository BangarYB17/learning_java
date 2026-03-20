public class shutdownHook {
    public static void main(String[] args) {
        Thread hook = new Thread(()->{
            System.out.println("Shutdown Hook is running...");
            System.out.println("Cleaning Resources");
        });
        Runtime.getRuntime().addShutdownHook(hook);
        System.out.println("Main methos is Running....");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("Main method completed.");
    }
}
