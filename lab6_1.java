import java.util.Random;
import java.util.Arrays;
public class lab6_1 {

    //GİTHUB USER_NAME=aliyy99

    public static int[] expandlist(int[] oldlist, int newsize){
        int[] new_list= new int[newsize];
        for(int i=0;i<oldlist.length && i<newsize;i++){
            new_list[i]=oldlist[i];
        }

        return new_list;

    }

    public static int[] rotate(int[] array,int arraynum){
        int[] newlist=new int[arraynum];
        for(int i=1;i<arraynum;i++){
            newlist[0]=array[arraynum-1];
            newlist[i]=array[i-1];
        }
        return newlist;
    }

     static void main(String[] args) {



        int[] myarr={4, 8, 15, 16, 23, 42};

        //scenario0

        //we have six elemen so output will be six
        System.out.println("length of array: "+myarr.length);
        //first element is 0.index. therefore we should write myarr[0] for first element
        System.out.println("value of first element: "+myarr[0]);
        //we have six element therefore index of last element is 5 so we have to write myarr[5] for last element
        System.out.println("value of last element: "+myarr[5]);
        //third element is equal to second index
        System.out.println("value of the third element: "+myarr[2]);
        //We write the index of whichever element we want.
        System.out.println("value of myarr[3]: "+myarr[3]);
        //there is an error in below line. because we have six element and last index is 5 so we don't have element of 10.index
        System.out.println(myarr[10]);

        //scenario1

        int[] oldlist=new int[20];
        int firstid=1000;

        for(int i=0;i<oldlist.length;i++){
            oldlist[i]=firstid+i;

        }
        System.out.println(Arrays.toString(oldlist));

        int newsize=42;
        int[] newlist=expandlist(oldlist,newsize);

        System.out.println(Arrays.toString(newlist));

        //scenario2

         Random random = new Random();

         int arraynum = random.nextInt(11) + 10;

         int[] array = new int[arraynum];

         for(int a=0;a<arraynum;a++){
             int numbers=random.nextInt(100);
             array[a]=numbers;
         }

         System.out.println("original list: "+Arrays.toString(array));

         int[] new_list=rotate(array,arraynum);

         System.out.println("new list: "+Arrays.toString(new_list));


    }


}
