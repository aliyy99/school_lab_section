import java.util.Scanner;

public class Lab5 {
    //scenario0
    public static int factorial(int n){
        if(n>1){
            return n*factorial(n-1);
        }
        else{
            return 1;
        }
    }
    //scenario01

    static int sumdigits(int k){
        k=Math.abs(k);
        int sum=0;
        if(k>10){
            return sum+=k%10+sumdigits(k/10);
        }
        else {
            return k;
        }
    }
    //scenario02
    static long power(long base,int exp){
        if(exp==0){
            return 1;
        }
        else {
            return base*power(base,exp-1);
        }

    }
    //bonus
    static int fib(int n){
        int f=0;
        int f1=0;
        int f2=1;
        if(n==0) f=f1;
        if(n==1) f=f2;
        for(int i=2;i<=n;i++){
            f=f1+f2;
            f1=f2;
            f2=f;

        }
        return f;
    }

    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println(factorial(5));

        System.out.print("enter an integer number:");
        int num=scanner.nextInt();

        System.out.println(sumdigits(num));

        System.out.println(power(3,4));

        System.out.println(fib(5));

    }

}