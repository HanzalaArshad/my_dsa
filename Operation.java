import java.util.*;

public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be inserted:");
        int number = sc.nextInt();

        System.out.println("Enter the index where the number should be inserted:");
        int index = sc.nextInt();

        if (index < 0 || index > n) {
            System.out.println("Invalid index!");
        } else {
            // Shift elements to the right from the insertion index onwards
            for (int i = n - 1; i >= index; i--) {
                arr[i + 1] = arr[i];
            }

            // Insert the number at the specified index
            arr[index] = number;

            System.out.println("Array after inserting the number:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
