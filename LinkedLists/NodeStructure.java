/* A linked list is a linear data structure in which elements (nodes) are stored in sequence,
 * each containing a data part and a reference (or link) to the next node in the sequence.
 */

// Each node in a linkedlist contains: 
// Data (value of the node)
// Pointer (address of the next node)

class Node{
    int data;
    Node next; // Pointer

    Node(int data){
        this.data = data;
        this.next = null;
    }
}