package Account;

public class SalaryAccount extends Account {
    protected double salaryAccountBalance;

    public SalaryAccount(double salaryAccountBalance) {

        this.salaryAccountBalance=salaryAccountBalance;
    }
    @Override
    public String transfer(CreditAccount creditAccount, double amount){
        if (amount <=this.salaryAccountBalance) {
            this.salaryAccountBalance -= amount;
            creditAccount.setCreditAccountBalance(creditAccount.getCreditAccountBalance() + amount);
            return "Transferred " + amount + "From Salary Account to Credit Account";
        }
        else
        {
            return "insufficient Balance";
        }
    }
    @Override
    public String transfer(SavingAccount savingAccount,double amount){
        if(amount<=this.salaryAccountBalance) {
            this.salaryAccountBalance -= amount;
            savingAccount.setSavingAccountBalance (savingAccount.getSavingAccountBalance() + amount);
            return "Transferred " + amount + "From Salary Account to Credit Account";
        }else
        {
            return "insufficient Balance";
        }
    }
    public String deposit(double amount){
        this.salaryAccountBalance+=amount;
        return "Deposit successful. $"+  amount +" has been added to your account.\n Current Balance is "+salaryAccountBalance;
    }
    public String withdraw(double amount) {
        if (this.salaryAccountBalance >= amount) {
            this.salaryAccountBalance -= amount;
            return ("Withdrawal successful. $" + amount + " has been deducted from your account. Current Balance="+getSalaryAccountBalance());

        } else {
            return ("Insufficient funds. Withdrawal failed.");

        }
    }
    @Override
    public  double getSalaryAccountBalance() {
        return salaryAccountBalance;
    }

    public  void setSalaryAccountBalance(double salaryAccountBalance) {
        this.salaryAccountBalance = salaryAccountBalance;
    }
}
