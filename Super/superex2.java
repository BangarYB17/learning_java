/* - parent and child class having same method name. 
   - Access parent class method using super keyword.*/
class parent{
    void show(){
        System.out.println("Parent Method");
    }
}
class child extends parent{
    void show(){
        super.show(); // Refers to Parent method
        System.out.println("Child Method");
    }
}


public class superex2 {
    public static void main(String[] args) {
        child msg = new child();
        msg.show(); 
    }
}
