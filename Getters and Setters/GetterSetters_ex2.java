class employee{
    private double salary;

    public void setSalary(double salary){
        if(salary>0){
            this.salary=salary;
        }else{
            System.out.println("Invalid Amount...!!!");
        }
    }
    public double getSalary(){
        return salary;
    }
}



public class GetterSetters_ex2 {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.setSalary(50000.00);

        System.out.println("Salary: "+emp.getSalary());

        employee emp2 = new employee();
        emp2.setSalary(0);

        System.out.println("Salary: "+emp2.getSalary());
    }
}
