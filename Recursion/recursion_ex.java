public class recursion_ex{
    static void fun(int n){
        if(n>0){
            // fun(n-1);
            // System.out.println(n);  1 2 3
            System.out.println(n);
            fun(n-1); //3 2 1
              
        }
    }
    public static void main(String[]args){
        int x = 3;
        fun(x);
    }
}