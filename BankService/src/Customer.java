import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        BankService bankService = new BankService();

        // Prompt the user for input for savings account
        System.out.println("Enter account type for savings account (saving): ");
        String savingsAccountType = scanner.nextLine();

        System.out.println("Enter initial balance for savings account: ");
        int savingsInitialBalance = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left in the buffer

        // Prompt the user for input for investment account
        System.out.println("Enter account type for investment account (investment): ");
        String investmentAccountType = scanner.nextLine();

        System.out.println("Enter initial balance for investment account: ");
        int investmentInitialBalance = scanner.nextInt();

        // Create accounts using user input
        String savingsAccount = bankService.createNewAccount(savingsAccountType, savingsInitialBalance);
        String investmentAccount = bankService.createNewAccount(investmentAccountType, investmentInitialBalance);
        
        
        System.out.println("Account balance information:");
        
        System.out.println("Savings account balance: $" + bankService.getAccountBalance(savingsAccount));
        System.out.println("Investment account balance: $" + bankService.getAccountBalance(investmentAccount));
        
        System.out.println("Enter transfer amount: ");
        int transferAmout = scanner.nextInt();
        bankService.transferMoney(savingsAccount,investmentAccount, transferAmout);
        
        System.out.println("\nAccount balance after transaction:");
        System.out.println("Savings account: $" + bankService.getAccountBalance(savingsAccount));
        System.out.println("Investment account: $" + bankService.getAccountBalance(investmentAccount));
    }   
}