//Delete node from a given position, assume position to be valid and
//start from 1


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

    public void insert(int position, int value){
        ListNode node = new ListNode(value);

        if (position == 1){
            node.next = head;
            head = node;
        }else{
            ListNode previous = head;
            int count = 1;

            while (count < position -1){
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    public ListNode deleteFirst(){
        if (head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast(){
        if (head==null || head.next == null){
            return null;
        }
        ListNode current = head;
        ListNode previous = null;

        while (current.next !=null){
            previous = current;
            current = current.next;
        }
        previous.next = null; //break the link
        return current;
    }
    public void delete(int position){
        if (position == 1){
            head = head.next;
        }
        else {
            ListNode previous = head;
            int count = 1;
            while (count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;

        }
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
        System.out.println();



        sll.delete(3);
        System.out.println();
        System.out.println("After third node is deleted");
        sll.display();
    }
}

