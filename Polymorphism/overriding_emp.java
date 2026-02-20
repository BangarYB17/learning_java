class employee{
    String name;
    double basesal;

    double calculatesal(){
        return basesal;
    }
    void showdetails(){
        System.out.println("Name:"+ name + " Salary" + calculatesal());
    }
}

class fulltimeemp extends employee{
    double bonus;

    @Override
    double calculatesal(){
        return basesal + bonus;
    }
    void showdetails(){
        System.out.println("Name:"+ name + " Salary :" + calculatesal());
    }
}

class parttimeemp extends employee{
    double houserent;

    @Override
    double calculatesal(){
        return basesal + houserent;
    }
    void showdetails(){
        System.out.println("Name:"+ name + " Salary" + calculatesal());
    }
}

class tempemp extends employee{
    int presentdays;
    double perdaysal;

    @Override
    double calculatesal(){
        return presentdays * perdaysal;
    }

    void showdetails(){
        System.out.println("Name:"+ name + " Salary:" + calculatesal());
    }
}

class overriding_emp{
    public static void main(String[] args){

        employee emp = new fulltimeemp();
        tempemp temp = new tempemp();

        emp.name = "Jayesh nagya";
        emp.basesal=15000.00;

        ((fulltimeemp)emp).bonus = 2500.0;

        emp.showdetails();

        temp.name="lekhit";
        temp.presentdays = 24;
        temp.perdaysal = 500;
        
        temp.showdetails();
    }
    
}