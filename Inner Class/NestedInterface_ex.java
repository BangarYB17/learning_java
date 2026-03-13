class outer{
    interface message{
        void display();
    }
}
class demo implements outer.message{
    public void display(){
        System.out.println("Nested interface run successfully.");
    }
}
public class NestedInterface_ex {
    public static void main(String[] args) {
    demo obj =new demo();
    obj.display();
    }
}
