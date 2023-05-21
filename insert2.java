import java.util.Scanner;

public class insert2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter how many elemnts to be enterd in arrray");
        int ar = sc.nextInt();
        int[] a = new int[ar];
        int[] b = new int[ar + 1];

        System.out.println("enter the values");

        for (int i = 0; i < ar; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("enter the index where the value insert");
        int ar1 = sc.nextInt();
        System.out.println("enter the value");
        int m = sc.nextInt();

        for (int i = 0; i < ar+1; i++) {
            if (i <ar1) {
                b[i] = a[i];
            } else if (i == ar1) {
                b[i] = m;
            } else {
                b[i] = a[i-1];
            }
        }

        System.out.println("elements are ");

        for (int i = 0; i <ar+1; i++) {
            System.out.println(b[i] + " ");
        }
    }
}