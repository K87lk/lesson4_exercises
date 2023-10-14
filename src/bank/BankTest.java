package bank;

import java.util.ArrayList;
import java.util.List;

public class BankTest {
    public static void main(String[] args) throws NotEnoughMoneyException, InactiveAccountException {
        BankAccount bankAccount1 = new BankAccount(1023, "John Doe", 23000, true);
        BankAccount bankAccount2 = new BankAccount(1033, "Jane Doe", 28000, true);
        BankAccount bankAccount3 = new BankAccount(3423, "Nick", 65000, true);
        BankAccount bankAccount4 = new BankAccount(65433, "Sam", 130000, true);
        BankAccount bankAccount5 = new BankAccount(34423, "Rick", 634208, false);
        BankAccount bankAccount6 = new BankAccount(6573, "David", 130650, false);

        BankAccountService bankAccountService = new BankAccountService();

        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(bankAccount1);
        bankAccounts.add(bankAccount2);
        bankAccounts.add(bankAccount3);
        bankAccounts.add(bankAccount4);
        bankAccounts.add(bankAccount5);
        bankAccounts.add(bankAccount6);

        System.out.println(bankAccountService.getInactiveAccounts(bankAccounts));

        System.out.println(bankAccountService.getAccountById(bankAccounts, 1023));

        bankAccountService.makeTransaction(bankAccount1, bankAccount2, 5000);
        System.out.println(bankAccount2.getAmount());
        System.out.println(bankAccount1.getAmount());

        bankAccountService.makeTransaction(bankAccount2, bankAccount4, 23000);
        System.out.println(bankAccount2.getAmount());
        System.out.println(bankAccount4.getAmount());


    }
}
