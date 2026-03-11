class emp{
    int id;
    String name; 

    public String toString(){
        return "Employee ID : "+id + ", Name : "+name;
    } 
}
public class tostring {
    public static void main(String[] args) {
        emp obj = new emp();
        obj.id = 420;
        obj.name = "Jayesh Nagya";
        System.out.println(obj);
    }
}
