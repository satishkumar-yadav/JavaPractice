public class BSTNode {
     BSTNode left;
     int key;
     BSTNode right;

     BSTNode(int key){
        this.key=key;
     }

     public BSTNode(BSTNode left, int key, BSTNode right){
        this.left=left;
        this.key=key;
        this.right=right;
     }
    
} 