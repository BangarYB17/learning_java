interface Calculation{
    int  add(int a, int b);
}
public class lambda_ex2 {
    public static void main(String[] args) {
       Calculation ad =(a,b)->a+b;

       System.out.println(ad.add(5,4));
    } 
}
