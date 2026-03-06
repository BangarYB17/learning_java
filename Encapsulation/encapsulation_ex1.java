/*Encapsulation in Java (Simple Explanation)
Encapsulation means wrapping data (variables) and methods (functions) into a single unit (class)
and restricting direct access to the data.

We use:
private variables
public getter and setter methods */

class employee{
    private double salary;    /*Private variable for (Data Hiding) */

    public void setSalary(double salary){    /*Setter Method for Salary */
        if(salary>0){
            this.salary=salary;
        }else{
            System.out.println("Invalid Amount...!!!");
        }
    }
    public double getSalary(){              /*Getter Method for Salary */
        return salary;
    }
}



public class encapsulation_ex1 {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.setSalary(50000.00);       

        System.out.println("Salary: "+emp.getSalary());

        employee emp2 = new employee();
        emp2.setSalary(-2000);

        System.out.println("Salary: "+emp2.getSalary());
    }
}
