import java.util.Scanner;

class LinkedList{
    Node head;  // head of the LL

    void InsertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void InsertAtEnd(int data){
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

    void InserAtPosition(int data, int pos){
        Node newNode = new Node(data);

        // inserting at the head
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // if pos is out of range
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteFromBeginning(int number){
        if (head == null) {
            return;
        }
        head = head.next;
    }

    void deleteFromEnd(int element){
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    boolean search(int key){
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    int countNodes(){
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void printList(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class SinglyLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        // to directly insert into the list try this
        // list.InsertAtEnd(10);
        // list.InsertAtEnd(30);
        // list.InserAtPosition(30, 2);
        // list.InsertAtBeginning(21);
        // list.printList();

        // for taking input from the user, try this
        System.out.print("Enter the number of Nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " values: ");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.InsertAtEnd(data);
        }
        System.out.print("LinkedList after insertion: ");
        list.printList();

        System.out.print("Enter the element you want to search for: ");
        int key = sc.nextInt();

        boolean found = list.search(key);
        if (found) {
            System.out.println("Element was found in the list");
        } else{
            System.out.println("Element was not found in the list");
        }

        System.out.print("Enter the element you want to delete from end: ");
        int element  = sc.nextInt();
        list.deleteFromEnd(element);

        System.out.print("Enter the element you want to delete from the beginning: ");
        int number = sc.nextInt();
        list.deleteFromBeginning(number);

        System.out.print("The number of elements in the LinkedList is: " + list.countNodes());
        System.out.println();


        System.out.print("LinkedList after operations: ");
        list.printList();
        sc.close();

    }
}