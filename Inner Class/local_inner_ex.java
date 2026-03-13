class Outer{
     void show(){
        class Inner{
             void message(){
                System.out.println("Welcome to FCT.");
             }
        }
        Inner inner = new Inner();
        inner.message();
     }
}
public class local_inner_ex {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
    }
}
