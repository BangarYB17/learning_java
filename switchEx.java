public class switchEX{
    public static void main(String[] args){
        /*example 1 */
        int num = 2;
        switch(num){
            case 1:
                System.out.println("My Number is 1");
                break;
            case 2:
                System.out.println("My Number is 2");
                break;
            case 3:
                System.out.println("My Number is 3");
                break;
            default:
                System.out.println("No Number is Match");
                break;
        }

        /*example 2 */
        char grade = 'B';
        switch(grade){
            case 'A':
            case 'B':
            case 'C':
                System.out.println("PASS");
                break;
            default:System.out.println("FAIL");
                break;

        }

        /* short syntax for switch case */
       /* char grade = 'B';
        String result = switch(grade){
            case 'A','B','C'-->'PASS';
                
            default:-->'FAIL';
              
        }
        System.out.println(result); *S/
 
        /* Ternary Operator */ 
        int year=2023;
        /* boolean result = ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) ? true : false;
         System.out.println(result); */

        String result = ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) ? "Leap Year": "Not Leap Year";
        System.out.println(result);
    }
}