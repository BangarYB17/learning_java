public class selection_statement{
    public static void main(String a[]){
        int age = 18;
        
        /*if(condition){
            block of code
        }

        1.The condition must be boolean expression always
        2.no ; after the if statement and the statement continues  in the {} braces  */

        if(age >= 18){
            System.out.println("Eligible For Voting");
        }


       /* if ....... else
        if(condition){
            block of code
        }else{
            block of code
        }
        1.if the condtion is true then if block executed otherwise else block executed */

        if(age >= 18){
            System.out.println("Eligible For Voting");
        }else{
            System.out.println("You are a Minor");
        }

        int num = 9 ;

        if (num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        int year = 2004;

        if((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not leap Year");
        }

        /* else if example */
        int marks = 40;
        if(marks >=90){
            System.out.println("Grade: O");
        }else if(marks >=70){
            System.out.println("Grade: A");
        }
        else if(marks >=60){
            System.out.println("Grade: B");
        } else if(marks >=40){
            System.out.println("Grade: C");
        }else{
            System.out.println("Fail");
        }

        /* POsitiveor negative */
        int num2 = -2;
        if(num2 > 0){
            System.out.println("Positive");
        }else if(num2 < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        /* if number divisible by 3 and 6 then print fizzBuzz
         if divisible not then number */

        int num3 = 14;
        if(num3 % 3 == 0 && num3 % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(num3 % 3 == 0){
            System.out.println("Fizz");
        }else if(num3 % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(num3);
        }

        int weight = 40;
        int age2 =20;
        
        if(weight > 50){
            if(age2 >= 18){
                System.out.println("you can donate");
            }
        }else{
            System.out.println("you are not able to donate");
        }

        int att = 75 ;
        int marks2 = 55;
        if(att >= 75){
            if(marks2 >=40){
                System.out.println("Pass");
            }
        }else {
            System.out.println("Fail");
        }
    }
}