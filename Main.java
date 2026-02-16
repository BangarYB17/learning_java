/*public class Main{
    public static void main(String args[]){
         className objName = new ClassName() 
        Main obj = new Main();
    }
} */

class Dog{
    String name;
     void Bark(){
        System.out.println(name + " Barking!");
     }
}
public class Main{
    public static void main(String args[]){
        Dog obj = new Dog();
        obj.name = "Lekhit";
        obj.Bark();
    }
}