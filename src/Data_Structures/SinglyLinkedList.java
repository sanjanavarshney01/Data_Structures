package couple;
public class SinglyLinkedList {
    Node head;             //instance variable

    SinglyLinkedList() {
        head = null;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node n1 = new Node();
        n1.data = 10;
        singlyLinkedList.insert(n1);
    }

    public void insert(Node newNode) {
        if (head == null) {
            head = newNode;
        }
        else {
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }

    }

    public static class Node {
        int data;
        Node next;
    }
}
