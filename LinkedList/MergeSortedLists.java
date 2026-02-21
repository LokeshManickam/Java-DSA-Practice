package LinkedList;

import java.util.Scanner;

public class MergeSortedLists {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at end helper
    static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Merge two sorted lists
    static Node merge(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) {
            tail.next = l1;
        }
        if (l2 != null) {
            tail.next = l2;
        }

        return dummy.next;
    }

    // Display list
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node l1 = null;
        Node l2 = null;

        // Input first sorted list
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            l1 = insertAtEnd(l1, sc.nextInt());
        }

        // Input second sorted list
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            l2 = insertAtEnd(l2, sc.nextInt());
        }

        Node mergedHead = merge(l1, l2);

        System.out.println("Merged Sorted List:");
        display(mergedHead);

        sc.close();
    }
}
