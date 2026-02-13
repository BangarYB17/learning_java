public class whileEx{
    public static void main(String[] args){
        /* While condition syntax
        while(condition){
              block of code
        } */

        /* 10 to 1 */
        System.out.println("****** 10 to 1 *******");
        int num = 10;
        while(num >= 1){
            System.out.println(num);
            num--;
        }

        System.out.println("******* 1 to 10 *******");
        /* 1 to 10 */
        int num2 = 1;
        while(num2 <=10){
            System.out.println(num2);
            num2++;
        }

        System.out.println("******* factorial *******");
        /* Factorial */
        int num3 = 5;
        int fact = 1;
        int i = 1;
        while(i <=num3){
            fact = fact * i;
            i++;
        }System.out.println(fact);
    }
}