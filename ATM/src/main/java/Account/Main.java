package Account;

import Account.Account;

public class Main {
    public static void main(String[] args) {
        CreditAccount creditAccount=new CreditAccount(500);
        SalaryAccount salaryAccount=new SalaryAccount(900);
        SavingAccount savingAccount=new SavingAccount(700);
        Account account1=new Account(123,creditAccount,salaryAccount,savingAccount);
        System.out.println(account1.creditAccount.transfer(salaryAccount,5000));
        System.out.println(account1.salaryAccount.salaryAccountBalance);
        System.out.println(account1.creditAccount.creditAccountBalance);
        System.out.println(account1.getTotalBalance());

    }
}
