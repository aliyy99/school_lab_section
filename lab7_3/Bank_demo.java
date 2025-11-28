import java.util.Scanner;

public class Bank_demo {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO BANK");
        System.out.println();
        System.out.print("enter your id(6 digits): ");
        int id=sc.nextInt();
        BankAccount bank=new BankAccount(id,0);
        System.out.println();
        System.out.print("Do you want to change your account_id(Y/F) ?: ");
        char change=sc.next().charAt(0);
        if(change=='Y'|| change=='y'){
            System.out.print("enter your new id: ");
            int new_id=sc.nextInt();
            bank.setAccountid(new_id);
            System.out.printf("Old id: %d , new id: %d\n",id,new_id);
        }
        boolean maintain=true;
        while (maintain){
            System.out.println("\n1-Withdraw");
            System.out.println("2-Deposit");
            System.out.println("3-Account Details");
            System.out.println("4-Exit");
            System.out.println();
            System.out.print("Choose an process(1-4): ");
            int process=sc.nextInt();
            if(process<=0){
                System.out.println("You should choose between 1 and 4 !!!");
            } else if (process==1) {
                System.out.print("enter withdraw amount: ");
                double withdraw=sc.nextDouble();
                if (withdraw<=0){
                    System.out.println("withdraw amount must be positive number !!!");
                } else if (withdraw> bank.getBalance()) {
                    System.out.println("Insufficient balance !!!");
                }
                else {
                    bank.withdraw(withdraw);
                    System.out.println("money is withdraw successfully !");
                }
            } else if (process==2) {
                System.out.print("enter deposit amount: ");
                double deposit=sc.nextDouble();
                if(deposit<=0){
                    System.out.println("deposit amount must be positive number !!!");
                }
                else{
                    bank.deposit(deposit);
                    System.out.println("money is deposited successfully !");
                }
            } else if (process==3) {
                bank.account();
            } else if (process==4) {
                System.out.println("EXITING...");
                break;
            }
        }
    }


}
