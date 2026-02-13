public class car{
    String color;
    String brand;
    public car(String color,String brand){
        this.color =color;
        this.brand =brand;
    }

    public void display(){
        System.out.println("The Color is "+color);
        System.out.println("The Brand is "+brand);
    }

    public static void main(String a[]){
        car obj = new car("white","Fortuner");
        obj.display();
    }
}