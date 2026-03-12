public class Throw_ex {
    public static void main(String[] args) {
        int age = 14;
        if(age<18){
            throw new ArithmeticException("You are not eligible");
        }
        System.out.println("Eligible");
    }
}
