/*finally block always execute even if exception occurs or not , it always run. */

public class finally_ex {
    public static void main(String[] args) {
        try {
           int a = 10;
           int b = 0;
           int result = a/b;
           System.out.println(result); 
        }
        catch (ArithmeticException e) {
            // System.out.println("Cannot divide by zero...");
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block executes");    // always execute.
        }
        System.out.println("Program continues....");
    }
}
