
/* public class index{
    public static void main(String a[]){
        System.out.print("Yogeshwar");
    }
} */

// flow of java
// dev -> java code .java -> compiler (javac) -> Byte code (.class) ->JDK -> JRE and libraries -> JVM -> OS ->HW 

import java.util.Scanner;
public class index{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age :");
        int age = sc.nextInt();

        System.out.println("Age:" + age);

        sc.close();
    }
}
