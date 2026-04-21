public class BSTUserProg {

    public static void main(String[] args) {
        BinarySearchTree bst= new BinarySearchTree();

        bst.add(50);
        bst.add(40);
        bst.add(70);
        bst.add(30);
        bst.add(60);
        bst.add(45);
        bst.add(90);

        System.out.println(bst.size());

        bst.levelOrder();
        System.out.println(" : Level Order");

        bst.inOrder();
        System.out.println(" : In Order");

        bst.preOrder();
        System.out.println(" : Pre Order");

        bst.postOrder();
        System.out.println(" : Post Order");

        System.out.println("Max : "+bst.maxNode());
        System.out.println("Min : "+bst.minNode());
        System.out.println("Sec Max : "+bst.secMaxNode());

        // bst.levelOrder();
        // System.out.println();
        // bst.remove(50);
        // bst.levelOrder();

    }
}      