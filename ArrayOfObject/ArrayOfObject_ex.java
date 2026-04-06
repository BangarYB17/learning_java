class Student{
    int id;
    String name;
    void display(){
        System.out.println("Id: " +id +" Name: "+name);
    }
}

public class ArrayOfObject_ex{
    public static void main(String[] args) {
        Student[] obj =new Student[3];
         obj[0] = new Student();
         obj[0].id =420;
         obj[0].name ="Jayesh Nagya";

         obj[1]=new Student();
         obj[1].id =786;
         obj[1].name ="vaibhav rangari";

         obj[2]=new Student();
         obj[2].id =14;
         obj[2].name ="Lekhit gulambi";
         
        //  for(int i=0;i<obj.length;i++){
        //       obj[i].display();
        //  }

         for(Student s:obj){
            s.display();
         }
    }
}