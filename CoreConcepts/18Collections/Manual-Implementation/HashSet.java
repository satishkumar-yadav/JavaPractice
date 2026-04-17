class HashSet{
    Node[]a = new Node[10];
    int count=0;

    public boolean add(Object data){
        Node n = new Node(data);
        int index= Math.abs(data.hashCode()% a.length);
        if(a[index]==null){
            a[index]=n;
            count++;
            return true;
        }
        Node temp = null;
        Node current = a[index];
        while (current != null) {
            if(current.data.equals(data)) return false;
            temp = current;
            current=current.next;
        }
        temp.next=n;
        count++;
        return true;
    }

    public boolean contains(Object data) {
        int index = Math.abs(data.hashCode() % a.length);
        Node current = a[index];
        while (current != null) {
            if (current.data.equals(data))
                return true;
            current = current.next;
        }
        return false;
    }

    public boolean remove(Object data) {
        int index = Math.abs(data.hashCode() % a.length);
        Node current = a[index];
        Node temp=a[index];
        int c=0;
        while (current != null) {
            if (current.data.equals(data))
            {
                temp.next= temp.next.next;
                count--;
                return true;
            }
            current = current.next;
            if(c!=0) temp=temp.next;
            c++;
        }
        return false;
    }

    public void display(){
        for (int i = 0; i < a.length; i++) {
            Node current = a[i];
            while (current!=null) {
                System.out.println(current.data);
                current=current.next;
            }
        }
    }

    public int size() {return count;}

    public boolean isEmpty(){return count==0;}

}