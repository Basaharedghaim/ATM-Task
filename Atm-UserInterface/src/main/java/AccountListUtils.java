import java.util.List;
import Account.Account;
import Account.SalaryAccount;
import Account.CreditAccount;
import Account.SavingAccount;
public class AccountListUtils {

    public static Account findAccountById(List<Account> accountList, int desiredId) {
        for (Account account : accountList) {
            if (account.getUserId() == desiredId) {
                return account; // Found the account with the desired id
            }
        }
        return null; // Account with the desired id not found
    }

}
