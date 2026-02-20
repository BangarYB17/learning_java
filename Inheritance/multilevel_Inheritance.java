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

class premiumSavingAc extends SavingAccount{
    double bonusRate;

    void applyBonus(){
         double bonus = Balance * bonusRate / 100;
         Balance += bonus;
         System.out.println("Bonus Applied:" + bonus + " New Balance:" + Balance);
    }
    
}

 class multilevel_Inheritance{
    public static void main(String[] args){
     premiumSavingAc ac = new premiumSavingAc();

     ac.AcHolderName="Lekhit Gulambi";
     ac.Balance = 5000.00;
     ac.IntRate = 5;
     ac.bonusRate = 3;

     ac.deposit(4000.00);
     ac.AppltIntRate();
     ac.applyBonus();
    }
}