import java.util.*;

public class insert3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        // int size=sc.nextInt();

        System.out.println("enter how many elements to be entered in the array");
        int ar = sc.nextInt();
        int[] a = new int[ar];
        int[] b = new int[ar + 1];

        System.out.println("enter the values");

        for (int i = 0; i < ar; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("enter the index number where to insert");
        int in = sc.nextInt();
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("do you want to insert by making another array press 1 otherwise 2");
        int m = sc.nextInt();

        switch (m) {
            case 1: {
                for (int i = 0; i < ar+1; i++) {
                    if (i < in) {
                        b[i] = a[i];
                    } else if (i == in) {
                        b[i] = n;
                    } else {
                        b[i] = a[i - 1];
                    }
                }

                System.out.println("elements are:");

                for (int i = 0; i < ar + 1; i++) {
                    System.out.println(b[i] + " ");
                }
                break;
            }

            case 2: {
                for (int i = ar-1; i >=in ; i--) {
                    a[i] = a[i -1];
                }

                // insert the new element at the specified index
                a[in] = n;
                ar++;

                System.out.println("The updated array elements are:");
                for (int i = 0; i < ar + 1; i++) {
                    System.out.println(a[i]);
                }
                break;
            }

            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
