public class LL{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = head;
        tail = newNode;
    }

    public static void main(String[] args) {
        LL l = new LL();
        l.addFirst(2);
        l.addFirst(1);
        l.addLast(3);
        l.addLast(4);
    }
}