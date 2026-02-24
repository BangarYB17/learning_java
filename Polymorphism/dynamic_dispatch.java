class phone{
    public void greet(){
        System.out.println("Good Morning......");
    }

    public void name(){
        System.out.println("My name is java from base class");
    }
}

class SmartPhone extends phone{
    public void swagat(){
         System.out.println("Shubh Sakal.....");
    }
    @Override
    public void name(){
        System.out.println("My name is java from derived class");
    }
}

public class dynamic_dispatch{
    public static void main(String[] args){
       phone obj = new phone();
       obj.greet();
       obj.name();
       //obj.swagat(); // Not allow

       SmartPhone msg = new SmartPhone();
       msg.greet();
       msg.swagat();
       msg.name();

       phone obj3 = new SmartPhone();

       obj3.greet();
       obj3.name(); /*it returns latest value ex.. my name is derived class */
       //obj3.swagat(); //Not allow

       SmartPhone op = (SmartPhone)obj3;
       op.swagat();

       ((SmartPhone)obj3).swagat();   // Downcasting
    }
}