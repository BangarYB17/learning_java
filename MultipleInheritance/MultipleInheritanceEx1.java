interface AccountOperations {
    void deposit(double amount);
}

interface LoanOperations {
    void applyLoan(double amount);
}

// Class implements both interfaces
class SmartAccount implements AccountOperations, LoanOperations {
    
    String accountHolder;
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit amount: " + amount + " Balance: " + balance);
    }

    public void applyLoan(double amount) {
        balance += amount;
        System.out.println("Loan amount: " + amount + 
                           " for: " + accountHolder + 
                           ". New Balance: " + balance);
    }
}

public class MultipleInheritanceEx1 {
    public static void main(String[] args) {
        
        SmartAccount sc = new SmartAccount();
        sc.accountHolder = "Yogeshwar";
        sc.balance = 5000.00;

        sc.deposit(2000);
        sc.applyLoan(10000);
    }
}