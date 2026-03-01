// Interface with 100% abstraction
interface Vehicle
{
   void start();
   void stop();
}
// Car class implements the interface
class Car implements Vehicle
{
   public void start()
   {
       System.out.println("Car is starting...");
   }
   public void stop()
   {
       System.out.println("Car is stopping...");
   }
}
// Main class to test
public class interface_ex1
{
   public static void main(String[] args)
   {
       Vehicle v = new Car();  // Interface reference (polymorphism)
       v.start();
       v.stop();
   }
}