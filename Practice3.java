import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();

        System.out.print("Enter the index to insert the element at: ");
        int index = scanner.nextInt();

        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
        } else {
            // shift elements to the right to make space for the new element
            for (int i = size - 1; i >= index; i--) {
                arr[i] = arr[i - 1];
            }

            // insert the new element at the specified index
            arr[index] = element;

            // print the updated array
            System.out.println("The updated array elements are:");
            for (int i = 0; i < size + 1; i++) {
                System.out.println(arr[i]);
            }
        }

        scanner.close();
    }
}
