public class NodeDLL {
    NodeDLL next;
    Object data;
    NodeDLL prev;

    public NodeDLL(Object data){
        this.data=data;
    }

    public NodeDLL(NodeDLL next, Object data, NodeDLL prev){
        this.next=next;
        this.data=data;
        this.prev=prev;
    }
}
