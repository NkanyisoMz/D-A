//Create Double linked list

public class DoubleLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
    }

    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
        length = 0;
    }

    public boolean isEmpty(){
        return length == 0; //head is null
    }

    public int length(){
        return length;
    }
}