//Inserting a node at the beginning of the single linkedlist, 
//based on Q1 implementation


public class SingleLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;


    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();

        sll.insertFirst(1);
        sll.display();
        System.out.println();

        sll.insertFirst(5);
        sll.display();
        System.out.println();

        sll.insertFirst(15);
        sll.display();
        System.out.println();
    }
}