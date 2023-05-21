import java.util.Scanner;

class Single_creation {
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void creation() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("ENTER YOUR DATA ITEMS ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.println("IF YOU WANT TO ENTER DATA IN THE BEGINNING PRESS 1, " +
                                   "IF YOU WANT TO PRESS DATA AT THE END PRESS 2, " +
                                   "AND IF YOU WANT TO ENTER DATA AT THE SPECIFIC LOCATION PRESS 3");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;

                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;

                    case 3:
                        System.out.println("enter the position where you want to enter data ");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                }
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

public class LL2{
    public static void main(String[] args) {
        Single_creation li = new Single_creation();
        li.creation();
        li.traverser();
    }
}
