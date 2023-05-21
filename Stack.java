import java.util.Scanner;

class StackOperation {
    int top = -1;
    int n = 10;
    int arr[] = new int[n];

    void push(Scanner sc) { 
        System.out.println("enter the elements ");// Accept the Scanner object as an argument
        if (top == n - 1) {
            System.out.println("Overflow: Cannot insert more elements.");
        } else {
            int i = sc.nextInt(); // Read input using the Scanner object
            top = top + 1;
            arr[top] = i;
            System.out.println("elements inserted "+arr[top]);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow: Cannot delete element, stack is empty.");
        } else {
            
            top = top - 1;
            System.out.println("Item deleted."+top);
        }
    }

    void display() {
        System.out.println("Here are the elements:");
        for (int j = top; j >= 0; j--) {
            System.out.println(arr[j]);
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        StackOperation s = new StackOperation();
        Scanner sc = new Scanner(System.in);

        int p; // Declare the variable 'p' outside the loop

        do {
            System.out.println("ENTER 1 FOR PUSH");
            System.out.println("ENTER 2 FOR POP");
            System.out.println("ENTER 3 FOR DISPLAY");
            System.out.println("ENTER YOUR CHOICE ");
            int d = sc.nextInt();

            switch (d) {
                case 1: {
                    s.push(sc);
                    break;
                }
                case 2: {
                    s.pop();
                    break;
                }
                case 3: {
                    s.display();
                    break;
                }
            }

            System.out.println("ENTER 0 TO GO TO CHOICES AGAIN");
            System.out.println("ENTER ANY KEY TO EXIT");
            p = sc.nextInt(); // Move the input inside the loop

        } while (p == 0);

        System.out.println("Exit directly");

      
    }
}
