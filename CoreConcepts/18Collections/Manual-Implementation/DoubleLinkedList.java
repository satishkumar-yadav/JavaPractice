public class DoubleLinkedList {
    NodeDLL head;
    NodeDLL tail;
    int count=0;    

    public void add(Object o){
        NodeDLL n = new NodeDLL(o);
        if(head==null){
          head=n;
          tail=head;
          count++;
          return;
        }
        //m-I
        tail.next=n;
        n.prev=tail;
        tail=n;

         //m-II
         NodeDLL current= head;
         while(current.next!=null) current=current.next;
         current.next=n;
         n.prev=current;
         tail=n;
         
        count++;
    }

    public int size(){return count;}

    public boolean isEmpty() { return count==0;}


}
