package LinkedList;

import java.util.Scanner;

public class FindingMidElement {

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

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    void findMiddle() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Element: " + slow.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindingMidElement mid = new FindingMidElement();

        mid.insertAtBeginning(sc.nextInt());
        mid.insertAtBeginning(sc.nextInt());
        mid.insertAtEnd(sc.nextInt());
        mid.insertAtEnd(sc.nextInt());

        System.out.println("Linked List:");
        mid.display();

        mid.findMiddle();
        sc.close();
    }
}
