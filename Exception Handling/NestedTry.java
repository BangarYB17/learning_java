public class NestedTry {
    public static void main(String[] args) {
        try {
            int arr[] = {10,20,30,40,50};
            System.out.println(arr[4]);

            try {
                   int a = 10;
                   int b = 0;
                   int result = a/b;
                   System.out.println(result); 
            }
            catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero...");
            }
        } 
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("index does not found...");
        }
        System.out.println("Program continues....");
     }
}

