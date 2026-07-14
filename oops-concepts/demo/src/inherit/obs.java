package inherit;


class obs
{
    public static void main(String[] args)
    {
        // Creating two bank accounts
        BankAccount customer1 = new BankAccount(1001, "Vishwas", 10000);
        BankAccount customer2 = new BankAccount(1002, "Rahul", 5000);

        // Display Initial Details
        System.out.println("Initial Account Details");
        customer1.display();
        customer2.display();

        // Deposit
        customer1.deposit(2000);

        // Withdraw
        customer2.withdraw(1000);

        // Transfer Money
        customer1.transfer(customer2, 3000);

        // Final Details
        System.out.println("\nFinal Account Details");
        customer1.display();
        customer2.display();
    }
}