public class DoublyLinkedList {

    static Node head;

    public static void main(String[] args) {
        insertFirst(10);
        insertFirst(20);
        insertEnd(50);
        insertEnd(40);
        insertAfter(20, 30);

        display();

        displayRev();
    }

    // Insertion at the beginning in a doubly linkedlist
    public static void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insertion at the end in a doubly linkedlist
    public static void insertEnd(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
    }

    // Find a node by value
    public static Node find(int val){
        Node node = head;
        while (node != null) {
            if (head.data == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Insertion after a specific value
    public static void insertAfter(int after, int data){
        Node p = find(after);
        if (p == null) {
            System.out.println("Node with value " + " doesn't exists.");
            return;
        }
        Node node = new Node(data);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    // Display the linkedlist
    public static void display(){
        Node node = head;
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) 
                System.out.print(" -> ");
                node = node.next;
        }
        System.out.print(" -> END");
    }

    // Reversing a linkedlist
    public static void displayRev(){
        Node last = null;
        while (last != null) {
            System.out.println(last.data);
            if (last.prev != null) {
                System.out.println(" -> ");
                last = last.prev;
            }
        }
        System.out.println(" -> END");
    }

}

class Node{
    int data;
    Node next, prev;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
