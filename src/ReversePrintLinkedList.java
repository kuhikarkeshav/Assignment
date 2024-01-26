public class ReversePrintLinkedList {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        LinkedList linkedList = new LinkedList();

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        System.out.print("Linked List elements in reverse order: ");
        linkedList.printReverse();
    }
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printReverse() {
        printReverseRecursive(head);
        System.out.println(); 
    }

    private void printReverseRecursive(Node node) {
        if (node == null) {
            return;
        }
        printReverseRecursive(node.next);
        System.out.print(node.data + " ");
    }
}

