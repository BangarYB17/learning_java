/* - parent and child class having same variable name. 
   - Access parent class variable using super keyword.*/

class parent{
    String msg = "Parent Class";
}
class child extends parent{
    String msg = "Child Class";
    void show(){
        System.out.println(msg);         //Refers to child class. 
        System.out.println(super.msg);   // Refers to parent class.
    }
}
public class superex1{
    public static void main(String[] args) {
        child obj = new child();
        obj.show();
    }
}