interface MyInterface{
    void sayHello();
}
public class lambda_ex{
    public static void main(String[] args) {
    // MyInterface msg = new MyInterface() {
    //     public void sayHello(){
    //         System.out.println("Hello Everyone.");
    //     }
    // };
    // msg.sayHello();

    MyInterface msg =()->{
        System.out.println("Good Morning Everyone.");
     };
     msg.sayHello();
    }
}