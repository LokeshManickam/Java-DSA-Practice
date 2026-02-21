package LinkedList;

import java.util.Scanner;

public class DetectCycle {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // move 1 step
            fast = fast.next.next;    // move 2 steps

            if (slow == fast) {
                return true;          // cycle detected
            }
        }
        return false;                 // no cycle
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DetectCycle list = new DetectCycle();

        list.insertAtBeginning(sc.nextInt());
        list.insertAtEnd(sc.nextInt());
        list.insertAtEnd(sc.nextInt());
        list.insertAtEnd(sc.nextInt());

        // Creating cycle manually for testing
        list.head.next.next.next = list.head.next;

        if (list.hasCycle()) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }

        sc.close();
    }
}
