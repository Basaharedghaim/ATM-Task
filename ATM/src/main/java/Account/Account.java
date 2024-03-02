package Account;

public class Account {
    static protected long id=20240227;
    private long userId;
    protected int pin;
    CreditAccount creditAccount;
    SalaryAccount salaryAccount;
    SavingAccount savingAccount;

    public Account() {
    }

    public Account(int pin, CreditAccount creditAccount, SalaryAccount salaryAccount, SavingAccount savingAccount) {
        userId=++id;
        this.pin = pin;
        this.creditAccount = creditAccount;
        this.salaryAccount = salaryAccount;
        this.savingAccount = savingAccount;
    }
    public String transfer(SavingAccount savingAccount,double amount){
        return null;
    }
    public String transfer(SalaryAccount salaryAccount,double amount){
        return null;
    }
    public String transfer(CreditAccount creditAccount, double amount){
        return null;
    }
    public String getTotalBalance(){
        double totalBalance=salaryAccount.salaryAccountBalance+savingAccount.savingAccountBalance+creditAccount.creditAccountBalance;
        return "Your Total Balance is "+totalBalance;
    }
    public double getSalaryAccountBalance(){
        return salaryAccount.getSalaryAccountBalance();

    }
    public double getSavingAccountBalance(){
        return savingAccount.getSavingAccountBalance();
    }
    public double getCreditAccountBalance(){
        return creditAccount.getCreditAccountBalance();
    }

    public static long getId() {
        return id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }

    public SalaryAccount getSalaryAccount() {
        return salaryAccount;
    }

    public void setSalaryAccount(SalaryAccount salaryAccount) {
        this.salaryAccount = salaryAccount;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public long getUserId() {
        return userId;
    }
}
