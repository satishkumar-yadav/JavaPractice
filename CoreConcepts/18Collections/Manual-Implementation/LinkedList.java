public class LinkedList {
    Node head;
    int count =0;

    @Override
    public String toString() {
        if (head == null)
            return "null"; 
        String s = "";
        Node current = head;

        while (current != null) {
            s += current.data;
            if(current.next != null) s += " -> ";
            current = current.next;
        }
        return s ;
    }

    public void add(Object data){
        Node n = new Node(data);
        //check if its first element,  add first element
        if(head==null){
            head = n;
            count++;
            return;
        }
        Node current = head;
        //moving current to last
        while(current.next!=null) current = current.next;
        current.next=n;
        count++;
    }

    public Object get(int indx){
       if(indx<0 || indx > size())
           throw new IndexOutOfBoundsException();    // if not then it will throw null  pointer exception
        Node current = head;
        // count = 0;
        // while (current.next != null){
        //      count++;
        //      if(count==indx) break;
        //      current = current.next;
        //  }
        for (int i = 1; i <= indx; i++) {
          current = current.next;
        }
        return current.data;
    }

    public void addFirst(Object data){
       Node n = new Node(data);
       n.next = head;
       head=n;
       count++;
    }

    public void add(int index, Object data) {
        if (index <= 0 || index >= size())
            throw new IndexOutOfBoundsException(); // if not then it will throw null pointer exception
        Node current = head;
        Node n = new Node(data);

        for (int i = 1; i < index; i++) {
            current = current.next;
        }
      // System.out.println("\n Current data: "+current.data);

        n.next = current.next;
        current.next = n;
      //  System.out.println("\n Updated Current data: " + current.data);
        count++;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void display(){
      if(isEmpty()) {
        System.out.println("Linked List is empty:");
        return;
      }
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

   // remove last element
    public void remove(){
        if (isEmpty()) {
            System.out.println("Linked List is empty:");
            return;
        }
        Node current = head;
        // moving current to last-1
        for (int i = 1; i < size()-1; i++)
            current = current.next;
        current.next = null;
        count--;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List is empty:");
            return;
        }
       head = head.next;
        count--;
    }

    public void remove(int index) {
        if (index <= 0 || index >= size())
            throw new IndexOutOfBoundsException();
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        // System.out.println("\n Current data: "+current.data);
        current.next = current.next.next;
        count--;
    }

    public void removeAll() {
        if (isEmpty()) {
            System.out.println("Linked List is empty:");
            return;
        }
        Node current = head;
        current.next = null;
        count=0;
    }

}
