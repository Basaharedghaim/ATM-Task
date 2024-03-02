package Account;

public class SavingAccount extends Account {
    protected double savingAccountBalance;

    public SavingAccount(double savingAccountBalance) {

        this.savingAccountBalance=savingAccountBalance;
    }
    @Override
    public String transfer(SalaryAccount salaryAccount,double amount){
        if(amount<=this.savingAccountBalance) {
            this.savingAccountBalance -= amount;
            salaryAccount.setSalaryAccountBalance ( salaryAccount.getSalaryAccountBalance() + amount);
            return "Transferred " + amount + "From Saving Account to Salary Account";
        }
        else {
            return "insufficient Balance";
        }
    }
    @Override
    public String transfer(CreditAccount creditAccount, double amount){
        if(amount<=this.savingAccountBalance) {
            this.savingAccountBalance -= amount;
            creditAccount.setCreditAccountBalance ( creditAccount.getCreditAccountBalance() + amount);
            return "Transferred " + amount + "From Salary Account to Credit Account ,Current Balance= "+getSavingAccountBalance();
        }
        else {
            return "insufficient Balance";
        }
    }
    public String deposit(double amount){
        this.savingAccountBalance+=amount;
        return "Deposit successful. $"+  amount +" has been added to your account.\n Current Balance is "+getSavingAccountBalance();
    }

    public String withdraw(double amount) {
        if (this.savingAccountBalance >= amount) {
            this.savingAccountBalance -= amount;
            return ("Withdrawal successful. $" + amount + " has been deducted from your account.Current Balance= "+getSavingAccountBalance());

        } else {
            return ("Insufficient funds. Withdrawal failed.");

        }
    }
    public  double getSavingAccountBalance() {
        return savingAccountBalance;
    }

    public void setSavingAccountBalance(double savingAccountBalance) {
        this.savingAccountBalance = savingAccountBalance;
    }
}
