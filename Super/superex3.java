/*- Access parent class Constructor using super keyword.*/
class parent{
    parent(){
        System.out.println("Parent Constructor");
    }
}
class child extends parent{
    child(){
        super(); // Refers to Parent Constructor.
        System.out.println("Class constructor");
    }
}

public class superex3 {
    public static void main(String[] args) {
        child  msg= new child();
    
    }
}
