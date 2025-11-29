public class product {
    private String[] name;
    private int[] stock;

    public product(String[] n ,int[] s){
        name=n;
        stock=s;
    }
    public void setName(String[] a){name=a;}
    public void setStock(int[] a){stock=a;}
    public String[] getName(){return name;}
    public int[] getStock(){return stock;}

    public void buyOne(int a){
        if(stock[a]==0){
            System.out.println("This product is out of stock");
        }
        else {
            System.out.println("The product is bought successfully !");
            stock[a]-=1;
        }
    }
    public void printinfo(){
        for(int d=0;d< name.length;d++){
            System.out.println(name[d]+" - "+stock[d]);
        }
    }
}
