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
    public int size;

    public void addFirst(int data){
        Node temp=head;
        Node newNode = new Node(data);
        size++;
        if(temp==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node temp=head;
        Node newNode = new Node(data);
        size++;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " --> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void add(int index,int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while(i<index-1){
            i++;
            temp = temp.next;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
        }
        Node temp = head;
        for (int i = 0; i< size -2;i++){
            temp = temp.next;
        } 
        int val = temp.next.data;
        temp.next = null;
        size--;
        return val;
    }


    public static void main(String[] args) {
        LL l = new LL();
        
        l.addFirst(2);
        l.addFirst(1);
        l.addLast(3);
        l.addLast(4);
        l.add(4, 5);
        l.print();
        l.removeFirst();
        l.removeLast();
        System.out.println(l.size);
    }
}