import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public static class TNode{
        int node;
        TNode left;
        TNode right;

        public TNode(int node, TNode left, TNode right) {
            this.node = node;
            this.left = left;
            this.right = right;
        }
    }

    public void preOrderTraversing(TNode tree){
        if(tree == null){
            return;
        }
        System.out.println(tree.node);
        preOrderTraversing(tree.left);
        preOrderTraversing(tree.right);
    }

    public void inOrderTraversing(TNode tree){
        if(tree == null){
            return;
        }
        inOrderTraversing(tree.left);
        System.out.println(tree.node);
        inOrderTraversing(tree.right);
    }

    public void postOrderTraversing(TNode tree){
        if(tree == null){
            return;
        }
        postOrderTraversing(tree.left);
        postOrderTraversing(tree.right);
        System.out.println(tree.node);
    }

    public void breadthFirstSearch(TNode tree){
        Queue<TNode> queue = new LinkedList<>();
        queue.add(tree);
        while(!queue.isEmpty()){
            TNode node = queue.poll();
            System.out.println(node.node);

            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        TNode tNode =
                new TNode(1,
                        new TNode(2,
                                new TNode(4,null,null),
                                new TNode(5, null, null)),
                        new TNode(3,
                                new TNode(6, null, null),
                                new TNode(7, null, null)));
        BinaryTree binaryTree = new BinaryTree();

        // depth first search Traversing

        binaryTree.preOrderTraversing(tNode);
        System.out.println("-----------------");
        binaryTree.inOrderTraversing(tNode);
        System.out.println("-----------------");
        binaryTree.postOrderTraversing(tNode);

        // breadth first search Traversing

        System.out.println("-----------------");
        binaryTree.breadthFirstSearch(tNode);

    }
}
