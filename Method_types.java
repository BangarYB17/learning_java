public class Method_types{
    /* 1. Method with no return type */
    /*public void name(){
        System.out.println("FCT");
    }

    public static void main(String[] args){
        Method_types obj = new Method_types();
        obj.name();
    } */

    /* 2.Method with return type.
    public int name(){
        System.out.println("FCT");
        int data = 10;
        return data;
    }

    public static void main(String[] args){
        Method_types obj = new Method_types();
        int result = obj.name();
        System.out.println(result);
        obj.name();
    }  */

    /* 3. Method with parameter */
     /*   public int add(int num1, int num2){
                int result = num1 + num2;
                return result;
        }
     
    public static void main(String[] args){
        Method_types obj = new Method_types();
        int result = obj.add(5,4);
        System.out.println(result);
        
    }*/

   /* 5. static method */
   /* ex1*/
   /*static String SchoolName = "FCT";
   String Name;

   Method_types(String Name){
    this.Name = Name;
   }
   public void Display(){
    System.out.println(Name + "-" + SchoolName);
   }

   public static void main(String[] args){
     Method_types obj1 = new Method_types("Yogeshwar");
     Method_types obj2 = new Method_types("Lekhit(Gulambi)");
     Method_types obj3 = new Method_types("Jayesh(nagya)");
     obj1.Display();
     obj2.Display();
     obj3.Display();
   }*/

  /*ex2*/
  public static void Display(){
    System.out.println("hii");
  }
  public static void main(String[] args){
    Method_types.Display();
  }
}