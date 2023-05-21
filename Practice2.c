import java.util.Scanner;

public class Practice2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements to insert (maximum 100): ");
        int numElements = scanner.nextInt();

        int[] arr = new int[100];

        System.out.println("Enter the elements:");

        for (int i = 0; i < numElements; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The array elements are:");
        for (int i = 0; i < numElements; i++) {
            System.out.println(arr[i]);
        }

        scanner.close();
    }
}


