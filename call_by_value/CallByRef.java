class Student{
    int mark;
}
public class CallByRef {
    public static void changeValue(Student s){
        s.mark = 50;
    }
    public static void main(String[] args) {
       Student obj = new Student();
       obj.mark =90;
       
       changeValue(obj);
       System.out.println(obj.mark);
    }
}
