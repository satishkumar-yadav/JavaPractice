public class DoubleLinkedList {
    Node head;
    Node tail;
    int count=0;

    public void add(Object o){
        Node n = new Node(o);
        if(head==null){
          head=n;
          tail=head;
          count++;
          return;
        }
        tail.next=n;
        n.prev=tail;
        tail=n;
    }

    public int size(){return count;}

    public boolean isEmpty() { return count==0;}
}
