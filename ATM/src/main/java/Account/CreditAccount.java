package Account;

public class CreditAccount extends Account {
      protected double creditAccountBalance;

    public CreditAccount(double creditAccountBalance) {
        this.creditAccountBalance=creditAccountBalance;
    }
@Override
    public String transfer(SavingAccount savingAccount,double amount){
        if(amount<=this.creditAccountBalance) {
            this.creditAccountBalance -= amount;
            savingAccount.setSavingAccountBalance( savingAccount.getSavingAccountBalance() + amount);
            return "Transferred " + amount + "From Credit to Saving Account";
        }
        else {
            return "insufficient Balance";

        }
    }
    @Override
    public String transfer(SalaryAccount salaryAccount,double amount){
        if(amount<=this.creditAccountBalance) {
            this.creditAccountBalance -= amount;
            salaryAccount.setSalaryAccountBalance(salaryAccount.getSalaryAccountBalance() + amount);
            return "Transferred " + amount + "From Credit to Salary Account";
        }
        else {
            return "insufficient Balance";

        }
    }
    public  double getCreditAccountBalance() {
        return creditAccountBalance;
    }

    public void setCreditAccountBalance(double creditAccountBalance) {
        this.creditAccountBalance=creditAccountBalance;
    }
    public String deposit(double amount){
        this.creditAccountBalance+=amount;
        return "Deposit successful. $"+  amount +" has been added to your account.\n Current Balance is "+creditAccountBalance;
    }
    public String withdraw(double amount) {
        if (this.creditAccountBalance >= amount) {
            this.creditAccountBalance -= amount;
            return ("Withdrawal successful. $" + amount + " has been deducted from your account.");

        } else {
            return ("Insufficient funds. Withdrawal failed.");

        }
    }
}
