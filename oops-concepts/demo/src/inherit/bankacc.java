package inherit;

class BankAccount
{
    int accountNumber;
    String accountHolder;
    double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit Method
    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposited Amount : " + amount);
    }

    // Withdraw Method
    void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawn Amount : " + amount);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    // Transfer Method
    void transfer(BankAccount receiver, double amount)
    {
        if (amount <= balance)
        {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;

            System.out.println(amount + " transferred to " + receiver.accountHolder);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    // Display Account Details
    void display()
    {
        System.out.println("----------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }

}
