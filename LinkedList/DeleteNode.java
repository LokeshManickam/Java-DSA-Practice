package LinkedList;

import java.util.Scanner;

public class DeleteNode {

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

    void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {  // correct traversal
            temp = temp.next;
        }

        temp.next = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeleteNode list = new DeleteNode();

        list.insertAtBeginning(sc.nextInt());
        list.insertAtBeginning(sc.nextInt());
        list.insertAtEnd(sc.nextInt());
        list.insertAtEnd(sc.nextInt());

        System.out.println("Linked List:");
        list.display();

        list.deleteFromBeginning();
        list.deleteFromEnd();

        System.out.println("After Deletions:");
        list.display();
        sc.close();
    }
}
