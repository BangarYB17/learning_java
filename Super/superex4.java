class employee{
    String company;

    employee(String company){
        this.company = company;

        System.out.println("Employee Constructor Called....");
    }

    void getDetails(){
        System.out.println("Company: "+company);
    }
}

class manager extends employee{
    String department;

    manager(String company , String department){
        super(company);
        this.department = department;
        
        System.out.println("Manager Constructor Called....");
    }
    void getDetails(){
        super.getDetails();
        System.out.println("department: "+department);
    }
}

public class superex4 {
    public static void main(String[] args) {
        manager data = new manager("MAQ", "IT");
        data.getDetails();
    }
    
}
