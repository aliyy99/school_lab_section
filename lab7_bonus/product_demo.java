import java.util.Scanner;

public class product_demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("how many is there product in store ?:");
        int product=sc.nextInt();
        sc.nextLine();
        int[] stock=new int[product];
        String[] names=new String[product];
        int i=0;
        for(int a=0;a<product;a++) {
            System.out.print("enter product's name: ");
            String name = sc.nextLine();
            System.out.print("enter product's stock: ");
            int count = sc.nextInt();
            sc.nextLine();
            names[a]=name;
            stock[a]=count;
        }
        product prod=new product(names,stock);
        boolean okey=true;
        while (okey){
            System.out.println("\nBuy some product(B)");
            System.out.println("Exit(Q)");
            System.out.print("\nenter a choice: ");
            char choice=sc.next().charAt(0);
            sc.nextLine();
            if(choice=='B' || choice=='b'){
                System.out.print("Enter the product you want to purchase: ");
                String buy=sc.nextLine();
                int index;
                boolean found=true;
                for(int b=0;b< names.length;b++){
                    if((names[b].toLowerCase()).equals(buy.toLowerCase())){
                        index=b;
                        found=false;
                        prod.buyOne(index);
                        break;
                    }
                }
                if(found){
                    System.out.println("there isn't "+buy+" in the store !");
                }
            } else if (choice=='Q' || choice=='q') {
                okey=false;
                prod.printinfo();
            }
            else {
                System.out.println("Invalid input !");
            }
        }
        sc.close();
    }
}
