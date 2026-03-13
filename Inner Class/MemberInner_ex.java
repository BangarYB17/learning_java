class outer{
   private int x = 10;

    class inner{
         void display(){
            System.out.println("Value of x: "+ x);
         }
    }
}

public class MemberInner_ex {
    public static void main(String[] args) {
        outer obj = new outer();
        outer.inner inner = obj.new inner();
        inner.display();
    }
}
