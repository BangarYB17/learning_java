/* is a class means a class without a name , it is used when class is required only once. */
interface Greeting{
    void sayHello();
}
public class AnonymousInner_ex {
    public static void main(String[] args) {
       Greeting obj = new Greeting() {
           public void sayHello(){
            System.out.println("Hello FCT.");
           }
       };
       obj.sayHello();
    }
}
