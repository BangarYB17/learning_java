class Account{
    String AcHolderName;
    double Balance;

    void deposit(Double amt){
        Balance += amt;
        System.out.println("Deposit Amount:" + amt + "  New Balance:" + Balance);
    }
}

class SavingAccount extends Account{
    double IntRate;

    void AppltIntRate(){
        double interest = Balance * IntRate / 100;

        Balance += interest;
        System.out.println("Interest applied:" + interest + "  Current Balance:" + Balance);
    }
}

class CurrentAccount extends Account{
    double overdraftLimit;
    
    void DisplayLimit(double amt){
        // System.out.println(Balance);
         if(Balance + overdraftLimit >= amt){
            Balance -= amt;
            System.out.println("Withdrawn "+amt +". Remaining Balance: "+ Balance);
        }else{
            System.out.println("Overdraft Limit exceede!");
        }
        
    }
}

 class hierarchical_inheritance{
    public static void main(String[] args){
     SavingAccount ac = new SavingAccount();
     CurrentAccount limit = new CurrentAccount();

     limit.AcHolderName="Lekhit Gulambi";
     limit.Balance = 5000.00;
     ac.IntRate = 5;

     limit.overdraftLimit = 5000.00;

     ac.deposit(4000.00);
     ac.AppltIntRate();
     limit.DisplayLimit(5000.00);
    }
}