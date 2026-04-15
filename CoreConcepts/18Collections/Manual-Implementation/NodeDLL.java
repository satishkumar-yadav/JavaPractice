public class NodeDLL {
    Node next;
    Object data;
    Node prev;

    public NodeDLL(Object data){
        this.data=data;
    }

    public NodeDLL(Node next, Object data, Node prev){
        this.next=next;
        this.data=data;
        this.prev=prev;
    }
}
