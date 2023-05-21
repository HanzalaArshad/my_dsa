import java.util.*;
public class ArrayDeletion{
    public static void main(String[] args) {
       
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int [] arr=new int[size];

        System.out.println("how much of the element you want");
       int  numElement=sc.nextInt();
        System.out.println("enter the array elements");
        for(int i=0;i<numElement;i++){
         arr[i]=sc.nextInt();
        }

        u
        System.out.println("enter the position you want to delete");
        int pos=sc.nextInt();
        int item=arr[pos-1];
        for(int i=pos-1;i< numElement-1;i++){
            arr[i]=arr[i+1];
        }
        numElement--;
        System.out.println("updated array");
        for(int i=0;i<numElement;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println("the deleted item  "+item);
    }
}