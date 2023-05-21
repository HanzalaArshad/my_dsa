import java.util.Scanner;

class Single_creation {
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    Node head = null;

    void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("ENTER YOUR DATA ITEMS ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("press 1 if you want to enter data again");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverser() {
        Node temp = head;
        if (head == null) {
            System.out.println("linked list is empty");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}

public class LL {
    public static void main(String[] args) {
        Single_creation li = new Single_creation();
        li.creation();
        li.traverser();
    }
}
