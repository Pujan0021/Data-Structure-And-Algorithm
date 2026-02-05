
import java.util.Scanner;

public class LinkedListImplementation {

    Node head;
    Node next;

    static class Node {

        int data;
        Node next;

        Node(int _data) {
            this.data = _data;
            this.next = null;

        }
    }

    //1. Insert at Beginning
    public void insertAtBeginning(int element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        System.out.println("Element inserted at the beginning : " + element);

    }

    //2. Insert at Last
    public void insertAtLast(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            System.out.println("Element inserted at the last: " + element);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Element inserted at the last: " + element);
    }

    //3. Traverse
    public void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.println("List of elements:");

        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        LinkedListImplementation linkedList = new LinkedListImplementation();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("====================Choice===================");
            System.out.println("1: Insert at first ");
            System.out.println("2: Insert at last");
            System.out.println("3: Traverse");
            System.out.println("4: Size");
            System.out.println("5: Search for an element");
            System.out.println("6: Delete from beginning");
            System.out.println("7: Delete from last");
            System.out.println("8: Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter an Element: ");
                    linkedList.insertAtBeginning(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter an Element: ");
                    linkedList.insertAtLast(sc.nextInt());
                    break;

                case 3:
                    linkedList.traverse();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
            }
        }
    }
}
