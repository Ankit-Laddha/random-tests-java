package other;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    public void traversePreOrder(){
        traversePreOrder(root);
    }

    public void traversePostOrder(){
        traversePostOrder(root);
    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }

    private void traversePostOrder(Node root){
        if(root == null)
            return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println("Post = " + root.value);
    }

    private void traversePreOrder(Node root){
        if(root == null)
            return;
        System.out.println("Pre = " + root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    private void traverseInOrder(Node root){
        if(root == null)
            return;
        traverseInOrder(root.leftChild);
        System.out.println("In = " + root.value);
        traverseInOrder(root.rightChild);
    }

    public int height(){
        return height(root);
    }

    private int height(Node root){
        if(root.leftChild == null && root.rightChild == null)
            return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
            else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }
}
