package LinkedList;

import java.util.Scanner;

public class LinkedListDemo {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
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

    // Reverse LinkedList (Iterative)
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    // Display LinkedList
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        Scanner sc = new Scanner(System.in);

        // Taking input values
        list.insertAtBeginning(sc.nextInt());
        list.insertAtBeginning(sc.nextInt());
        list.insertAtEnd(sc.nextInt());
        list.insertAtEnd(sc.nextInt());

        System.out.println("Original Data:");
        list.display();

        list.reverse();

        System.out.println("Reversed Data:");
        list.display();

        sc.close();
    }
}
