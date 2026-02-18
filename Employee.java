/* parametrized constructor */
/*public class Employee{
    String name;
    double salary;

    Employee(String name , double salary){
        this.name = name;
        this.salary = salary;
        System.out.println("Constructor called...");
    }
    void EmployeeDetails(){
        System.out.println("Employee Name : " + name + " and salary " + salary);
    }
    public static void main(String[] args){
       System.out.println("Code started ...");
       Employee obj = new Employee("nagya",5.50);
       obj.EmployeeDetails();
    }
} */

public class Employee{
    String name;
    double salary;

    Employee(String name , double salary){
        this.name = name;
        this.salary = salary;
        System.out.println("Parametrized Constructor called...");
    }
    Employee(Employee emp){
        this.name = emp.name;
        this.salary = emp.salary;
        System.out.println("Copy Constructor called...");
    }
    void EmployeeDetails(){
        System.out.println("Employee Name : " + name + " and salary " + salary);
    }
    public static void main(String[] args){
       System.out.println("Code started ...");
       Employee obj = new Employee("jayesh nagya",5.50);
       Employee CopyObj = new Employee(obj);

       CopyObj.name = "Lekhit sheikh";
       CopyObj.salary = 500;
       obj.EmployeeDetails();
       CopyObj.EmployeeDetails();
    }
}