//Check if linkedlist has a loop


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

    public boolean search(int key){
        ListNode current = head;
        while (current != null){
            if (current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverse(ListNode head){
        if (head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    public ListNode getNthNodeFromEnd(int n){
        if (head == null){
            return null;
        }
        if (n<=0) {
            throw new IllegalArgumentException("Invalid value n: " + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr =head;

        int count = 0;

        while (count <n){
            if (refPtr == null){
                throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public void removeDuplicates(){
        if (head == null){
            return;
        }
        ListNode current = head;

        while (current != null && current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }

        }
    }

    public void insertInSortedList(int value) {
        ListNode newNode = new ListNode(value);

        // Case 1: Insert at the beginning if list is empty or value is smaller than head
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: Insert at the correct position in the sorted list
        ListNode current = head;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }

        // Insert the new node in the correct position
        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteNode(int key){
        ListNode current = head;
        ListNode temp = null;

        if (current != null && current.data == key){
            head = current.next;
            return;
        }

        while (current != null && current.data != key){
            temp = current;
            current = current.next;
        }
        if (current == null){
            return;
        }

        temp.next = current.next;
    }

    public boolean containsLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (slowPtr == fastPtr) {
                return true;
            }

        }
        return false;
    }

    public void createLoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = fourth;
    }


    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        SingleLinkedList sllLooped = new SingleLinkedList();


        // Creating a sorted linked list
        sll.head = new ListNode(1);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(11);

        // Connecting nodes (now sorted)
        sll.head.next = second; // 1 --> 8
        second.next = third;    // 1 --> 8 --> 10
        third.next = fourth;    // 1 --> 8 --> 10 --> 11 --> null
//
//        System.out.println("Original Sorted List:");
//        sll.display(); // Print original sorted list
//        System.out.println();

        System.out.print("Not looped linked list returns from containsLoop() function: ");
        System.out.println(sll.containsLoop());
        System.out.println();

        sllLooped.createLoopInLinkedList();
        System.out.print("Looped list returns from containsLoop function: ");
        System.out.println(sllLooped.containsLoop());

    }

}

