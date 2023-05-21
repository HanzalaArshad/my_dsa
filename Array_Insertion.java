 
 
import java.util.Scanner;
 public class Array_Insertion {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declare the array
        int[] arr ={4,5,43,2,3,4,2,3,4,} ;

        // initialize the array with some values
        // arR[0] = 10;
        // array[1] = 20;
        // array[2] = 30;
        // array[3] = 40;
        // array[4] = 50;

        // display the original array
        System.out.println("THE UNINSERTED ARRAY:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        // prompt the user for the element to insert and the position to insert at
        System.out.println("ENTER THE ELEMNET THAT YOUN WANT TOM INSERT IN ARRAY : ");
        int element = sc.nextInt();
        System.out.println("ENTER THE POSITION (POSITION STARTS FROM 1): ");
        int position = sc.nextInt();

        // shift all elements to the right of the insertion point to make room for the new element

        if(position<=50||position>arr.length+1){

            System.out.println("INVALID POSITION ");
        }
        for (int i = arr.length - 1; i > position - 1; i--) {
            arr[i] = arr[i - 1];
        }

        // insert the new element at the specified position
        arr[position - 1] = element;
        size++;

        // display the updated array
        System.out.println("THE INSERTED ARRAY :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
