package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccountService {
    public void makeTransaction(BankAccount from, BankAccount to, int amount) throws NotEnoughMoneyException, InactiveAccountException {
        if(from.getAmount() >= amount && from.isActive() && to.isActive()){
            int toAmountAfter = to.getAmount() + amount;
            int fromAmountAfter = from.getAmount() - amount;
            from.setAmount(fromAmountAfter);
            to.setAmount(toAmountAfter);
            System.out.println("Transaction succeeded. " + toAmountAfter);

            if(from.getAmount() < amount) {
                throw new NotEnoughMoneyException("Not enough money for transaction");
            }
            else if(!from.isActive() || !to.isActive()) {
                throw new InactiveAccountException("Some or ether of the accounts are inactive." +
                        " Cannot make a transaction");
            }
        }
    }
    public List<BankAccount> getInactiveAccounts(List<BankAccount> bankAccounts) {
        return bankAccounts.stream().filter(bankAccount ->
                !bankAccount.isActive()).collect(Collectors.toList());
    }
    public BankAccount getAccountById(List<BankAccount> bankAccounts, int id) {
        return bankAccounts.stream().filter(bankAccount -> bankAccount.getId() == id)
                .findAny().orElseThrow();
    }
}
