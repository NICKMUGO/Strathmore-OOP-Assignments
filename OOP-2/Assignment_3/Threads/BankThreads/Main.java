package Threads.BankThreads;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) throws Exception {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new Exception("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread implements Runnable {
    private BankAccount account;
    private double amount;

    public WithdrawThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        try {
            account.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount(1000.00);  // initial balance

        Thread depositThread1 = new DepositThread(account, 200.00);
        Thread depositThread2 = new DepositThread(account, 150.00);
        Thread withdrawThread1 = new Thread(new WithdrawThread(account, 100.00));
        Thread withdrawThread2 = new Thread(new WithdrawThread(account, 500.00));
        Thread withdrawThread3 = new Thread(new WithdrawThread(account, 700.00));

        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();
        withdrawThread3.start();

        try {
            depositThread1.join();
            depositThread2.join();
            withdrawThread1.join();
            withdrawThread2.join();
            withdrawThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
