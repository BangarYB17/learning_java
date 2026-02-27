class student{
    private int id;
    private String name;

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class GettersAndSetters{
    public static void main(String[] args) {
        student pratik = new student();
        
        pratik.setId(1);
        pratik.setName("pratik");

        System.out.println(pratik.getId());
        System.out.println(pratik.getName());

        student yogeshwar = new student();
        yogeshwar.setId(2);
        yogeshwar.setName("Yogeshwar");
        System.out.println(yogeshwar.getId());
        System.out.println(yogeshwar.getName());

    }
}