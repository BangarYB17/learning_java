abstract class vehicle{
    int noOfTypre;
   
    void displayTyre(){
        System.out.println(noOfTypre);
    }
   abstract void start();
}

class car extends vehicle{
    void start(){
        noOfTypre=4;
        System.out.println("Car is Start.");
    }
}
class bike extends vehicle{
    void start(){
        noOfTypre=2;
        System.out.println("bike is Start.");
    }
}

public class abstraction_ex1{
    public static void main(String[]args){
        vehicle car = new car();
        car.start();
        car.displayTyre();

        vehicle bike = new bike();
        bike.start();
        bike.displayTyre();
    }
}