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

    void DisplayLimit(){
        System.out.println("Overdraft Limit:"+ overdraftLimit);
    }
}

 class hierarchical_inheritance{
    public static void main(String[] args){
     SavingAccount ac = new SavingAccount();
     CurrentAccount limit = new CurrentAccount();

     ac.AcHolderName="Lekhit Gulambi";
     ac.Balance = 5000.00;
     ac.IntRate = 5;

     limit.overdraftLimit = 5000.00;

     ac.deposit(4000.00);
     ac.AppltIntRate();
     limit.DisplayLimit();
    }
}