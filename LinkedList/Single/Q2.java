//How to print elements of single linked list, based on Q1 implementation

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

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //connecting nodes
        sll.head.next = second; //10 -->1
        second.next = third;  //10 -->1 --> 8
        third.next =fourth;  //10 --> 1 -->8 -->11 --> null

        sll.display();
    }
}

