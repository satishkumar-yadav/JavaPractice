import java.util.ArrayDeque;
import java.util.Queue;

public class BinarySearchTree {
       BSTNode root;
       int count = 0;
       boolean flag;

       public boolean add(int key){
        flag=true;
        root=add(root,key);
        return flag;
       } 

       public BSTNode add(BSTNode n, int key){
        if(n==null) {
            n=new BSTNode(key);
            count++;
            return n;
        }
        if(key<n.key) n.left=add(n.left,key);
        else if (key > n.key) n.right = add(n.right, key);
        else flag=false;
        return n;
       }

       public int size(){ return count;}

       public boolean isEmpty(){ return count==0;}

       // DFS 
       public void preOrder(){ preOrder(root);}
       
       public void postOrder() {
          postOrder(root);
       }
       
       public void inOrder() {
          inOrder(root);
       }

       //BFS
       //public void levelOrder(){ levelOrder(root); } 

       public void levelOrder(){
        //    if (n == null) return;
        //    System.out.println(n.key);
        //    System.out.println();

        Queue<BSTNode> q = new ArrayDeque<BSTNode>();
        q.add(root);
        while (!q.isEmpty()) {
            BSTNode n = q.poll();
            System.out.print(n.key+" ");
            if(n.left != null) q.add(n.left);
            if(n.right != null) q.add(n.right);
        } 
       }

       public void preOrder(BSTNode n){
        if(n==null) return;
        System.out.print(n.key+" ");
        preOrder(n.left);
        preOrder(n.right);
       }

       public void postOrder(BSTNode n) {
           if (n == null)
               return;
           postOrder(n.left);
           postOrder(n.right);
           System.out.print(n.key+" ");
       }

       public void inOrder(BSTNode n) {
           if (n == null)
               return;
           inOrder(n.left);
           System.out.print(n.key+" ");
           inOrder(n.right);
       }
    
       public void remove(int key){ remove(root,key);}

       public BSTNode remove(BSTNode n, int key){
        //traversing
        if(n==null) return null;
        if(key<n.key) n.left=remove(n.left, key);
        else if(key>n.key) n.right=remove(n.right, key);
        else{
            // deleting
            if(n.left==null && n.right==null) return null;  // deleting leaf node
            else if(n.left==null) return n.right;   // deleting  one child 
            else if(n.right==null) return n.left;   // deleting  one child 
            else{       // deleting two child
                n.key=minNode(n.right);
                n.right=remove(n.right, n.key);
            }
        }
        return n;
       } 

       public int minNode() { return minNode(root);  }

       public int minNode(BSTNode n){
        int key= n.key;
        while(n.left !=  null){
            key = n.left.key;
            n=n.left;
        }
        return key;
       }

       public int  maxNode(){ return maxNode(root);}

       public int maxNode(BSTNode n) {
           int key = n.key;
           while (n.right != null) {
               key = n.right.key;
               n = n.right;
           }
           return key;
       }

       public int secMaxNode(){ return secMaxNode(root); }

       public int secMaxNode(BSTNode n) {
           int key = n.key;
           BSTNode prev=null;
           while (n.right != null) {
             //  key = n.right.key;
               prev = n;
               key=prev.key;
               n = n.right;
           }
           return key;
       }

}