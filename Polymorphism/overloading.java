class PropertyTax{
    public double calculatetax(double areasq){
        return areasq * 10;
    }
    public double calculatetax(int propertyvalue){
        return propertyvalue * 0.02;
    }
    public double calculatetax(double areasq , double propertyvalue){
        return areasq * propertyvalue;
    }
}

public class overloading{
    public static void main(String[] args){
        PropertyTax obj = new PropertyTax();
        
        System.out.println("Propery Tax by area " + obj.calculatetax(7000.00)); //double value
        System.out.println("Propery Tax by value " + obj.calculatetax(8000));   // int value 
         System.out.println("Propery Tax by value  and area " + obj.calculatetax(8000 ,20));   // int value 
    }
}