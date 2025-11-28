public class BankAccount {
    private int accountid;
    private double balance;

    public void setAccountid(int a){accountid=a;}
    public void setBalance(int a){balance=a;}
    public int getAccountid(){return accountid;}
    public double getBalance(){return balance;}

    public BankAccount(int x, int y){
        accountid=x;
        balance=y;

    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void account(){
        System.out.println("Acccount_id: "+accountid+", Balance: "+balance);
    }
}
