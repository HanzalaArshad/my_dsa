import java.util.Scanner;

public class 2{
    public static void main(String[] args) {
     int [] arr={1,3,5,7};
     System.out.println("the array");
     for(int i=0;i<=arr.length;i++){
        System.out.println(arr[i] +" ");
     }
     int element=3,index=0;
     for(int i=arr.length-1;i>index;i--){
        arr[i+1]=arr[i];
     }
     arr[index]=element;
     System.out.println("the array i nserte");
     for(int i=0;i<=arr.length;i++){
        System.out.println(arr[i]+" ")
     }
}


