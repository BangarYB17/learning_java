/*syntax of catch block:-
catch(Exceptiontype variable) 
*/

public class catch_ex {
    public static void main(String[] args) {
        // int arr[] = {10,20,30,40,50};
        // System.out.println(arr[5]);  index out of bound 
        /* try{
            int arr[] = {10,20,30,40,50};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index does not exist");
        }
        System.out.println("Program continues...."); */

        try{
            int a = 10;
            int b = 0;
            int result = a/b;
            System.out.println(result);   // only this exception handled.

            int arr[] = {10,20,30,40,50};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index does not exist");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero...");
        }
        
        System.out.println("Program continues....");
    }
}
