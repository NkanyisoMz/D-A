//Insert node at the end of double linked list

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

    public void insertLast(int value){ //Insert node last
        ListNode newNode = new ListNode(value);
        if (isEmpty()){
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail = newNode;
        }else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void displayForward(){
        if (head == null){
            return;
        }
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void displayBackward(){
        if (tail == null){
            return;
        }
        ListNode temp = tail;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(25);

        dll.displayForward();
        System.out.println();
        System.out.println();
        dll.displayBackward();
    }
}
