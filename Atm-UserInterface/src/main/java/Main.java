import Account.Account;
import Account.SalaryAccount;
import Account.CreditAccount;
import Account.SavingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts=new ArrayList<>();
        CreditAccount creditAccount=new CreditAccount(500);
        SalaryAccount salaryAccount=new SalaryAccount(1200);
        SavingAccount savingAccount=new SavingAccount(800);
        Account account1=new Account(1518,creditAccount,salaryAccount,savingAccount);
        accounts.add(account1);
        Scanner scanner=new Scanner(System.in);

        while (true)
        {
            System.out.println("Please Enter Your Id ");
            int userId= scanner.nextInt();
            Account foundAccount= AccountListUtils.findAccountById(accounts,userId);
            System.out.println("Please Enter Your Pin ");
            int PIN= scanner.nextInt();
            if (foundAccount!=null && foundAccount.getPin()==PIN){

                OuterOuterLoop:
                while (true)
                {
                    System.out.println("Choose your Account");
                    System.out.println("1. Salary Account");
                    System.out.println("2. Savings Account");
                    System.out.println("3. Credit Account");
                    System.out.println("4. show All Balance");
                    System.out.println("5. Exit");

                    int choice=scanner.nextInt();


                        switch (choice) {
                            case 1://Salary Account
                               OuterLoop:
                               while (true){
                                System.out.println("Choose Service From your Salary Account :");
                                System.out.println("1. Check Balance");
                                System.out.println("2. Deposit ");
                                System.out.println("3. Withdraw");
                                System.out.println("4. Transfer between Accounts");
                                System.out.println("5. Exit");
                                System.out.println("6. Exit All");
                                int salaryChoice = scanner.nextInt();

                                    switch (salaryChoice) {
                                        case 1:
                                            System.out.println(foundAccount.getSalaryAccountBalance());
                                            break;
                                        case 2:
                                            System.out.println("Enter the Amount");
                                            int deposit1 = scanner.nextInt();
                                            foundAccount.getSalaryAccount().deposit(deposit1);
                                            break;
                                        case 3:
                                            System.out.println("Enter the Amount");
                                            int withdraw1 = scanner.nextInt();
                                            foundAccount.getSalaryAccount().withdraw(withdraw1);
                                            break;
                                        case 4:
                                           InnerLoop:
                                           while (true)
                                           {
                                            System.out.println("Choose Account To Transfer");
                                            System.out.println("1. Savings Account");
                                            System.out.println("2. Credit Account");
                                            System.out.println("3. Exit Transferring");
                                            int acc = scanner.nextInt();

                                            innerLoop:
                                            switch (acc) {
                                                case 1:
                                                    System.out.println("Enter Amount to Transfer");
                                                    double transferAmount = scanner.nextDouble();
                                                    System.out.println(foundAccount.getSalaryAccount().transfer(foundAccount.getSavingAccount(), transferAmount));
                                                    break;
                                                case 2:
                                                    System.out.println("Enter Amount to Transfer");
                                                    double transferAmount1 = scanner.nextDouble();
                                                    System.out.println(foundAccount.getSalaryAccount().transfer(foundAccount.getCreditAccount(), transferAmount1));
                                                    break;
                                                case 3:
                                                    break innerLoop;
                                                default:
                                                    continue;
                                            }
                                            break ;
                                            }
                                        case 5:
                                            break OuterLoop;
                                        case 6:
                                            break OuterOuterLoop;
                                        default:  continue ;
                                    }
                                }
                               break ;
                            case 2:// Savings Account
                                innerLoop:
                                while (true){
                                    System.out.println("Choose Service From your Savings Account :");
                                    System.out.println("1. Check Balance");
                                    System.out.println("2. Deposit ");
                                    System.out.println("3. Transfer between Accounts");
                                    System.out.println("4. Exit");
                                    System.out.println("5. Exit All");
                                    int savingChoice = scanner.nextInt();
                                    switch (savingChoice) {
                                        case 1:
                                            System.out.println(foundAccount.getSavingAccountBalance());
                                            break;
                                        case 2:
                                            System.out.println("Enter the Amount");
                                            int deposit1 = scanner.nextInt();
                                            foundAccount.getSavingAccount().deposit(deposit1);
                                            break;
                                        case 3:
                                            InnerLoop:
                                            while (true)
                                            {
                                                System.out.println("Choose Account To Transfer");
                                                System.out.println("1. Salary Account");
                                                System.out.println("2. Credit Account");
                                                System.out.println("3. Exit Transferring");
                                                int acc = scanner.nextInt();
                                                switch (acc) {
                                                    case 1:
                                                        System.out.println("Enter Amount to Transfer");
                                                        double transferAmount = scanner.nextDouble();
                                                        System.out.println(foundAccount.getSavingAccount().transfer(foundAccount.getSalaryAccount(), transferAmount));
                                                        break;
                                                    case 2:
                                                        System.out.println("Enter Amount to Transfer");
                                                        double transferAmount1 = scanner.nextDouble();
                                                        System.out.println(foundAccount.getSavingAccount().transfer(foundAccount.getCreditAccount(), transferAmount1));
                                                        break;
                                                    case 3:
                                                        break InnerLoop;
                                                    default:
                                                        continue;
                                                }
                                            }
                                        case 4:
                                            break innerLoop;
                                        case 5:
                                             break OuterOuterLoop ;
                                        default:
                                            System.out.println("Enter A valid Choice");                                    }
                                }
                                break ;

                             case 3:// Credit Account
                                innerLoop1:
                                while (true){
                                    System.out.println("Choose Service From your Credit Account :");
                                    System.out.println("1. Check Balance");
                                    System.out.println("2. Transfer between Accounts");
                                    System.out.println("3. Exit");
                                    System.out.println("4. Exit All");
                                    int creditChoice = scanner.nextInt();
                                    switch (creditChoice) {
                                        case 1:
                                            System.out.println(foundAccount.getSalaryAccountBalance());
                                            break;
                                        case 2:
                                            InnerLoop:
                                            while (true)
                                            {
                                                System.out.println("Choose Account To Transfer");
                                                System.out.println("1. Savings Account");
                                                System.out.println("2. Salary Account");
                                                System.out.println("3. Exit Transferring");
                                                int acc = scanner.nextInt();
                                                switch (acc) {
                                                    case 1:
                                                        System.out.println("Enter Amount to Transfer");
                                                        double transferAmount = scanner.nextDouble();
                                                        System.out.println(foundAccount.getCreditAccount().transfer(foundAccount.getSavingAccount(), transferAmount));
                                                        break;
                                                    case 2:
                                                        System.out.println("Enter Amount to Transfer");
                                                        double transferAmount1 = scanner.nextDouble();
                                                        System.out.println(foundAccount.getCreditAccount().transfer(foundAccount.getSalaryAccount(), transferAmount1));
                                                        break;
                                                    case 3:
                                                        break InnerLoop;
                                                    default:
                                                        continue;
                                                }
                                            }
                                        case 3:
                                            break innerLoop1;
                                        case 4:
                                            System.out.println("Enter A valid Choice");
                                    }
                                }
                                break ;
                              case 4:
                                  account1.getTotalBalance();
                                break  ;

                            case 5:
                                break OuterOuterLoop;
                            default:
                                  System.out.println("Enter A valid Choice");;
                        }
                    }
                }else
                System.out.println("***Error in ID or PIN***");
            }
        }
    }

