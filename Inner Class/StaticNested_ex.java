class outer{
    static int data = 50;
    static class inner{
         void display(){
             System.out.println(data);
         }
    }
}
public class StaticNested_ex {
    public static void main(String[] args) {
        outer.inner obj = new outer.inner();
        obj.display();
    }
}
