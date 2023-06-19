package tree;

public class BinaryTree {
    Node root;

    BinaryTree createBinaryTree(int[] ints) {
        BinaryTree binaryTree = new BinaryTree();
        for (int i : ints) {
            add(i);
        }
        return binaryTree;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public Node findNonRecursive(int v){
        Node curr = root;
        while(curr != null && curr.value != v){
            if(v < curr.value){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }
        return curr;
    }

    public Integer find(int  value){
        Node result= findNonRecursive(value);
        return result==null?null:result.value;

    }
    public Node findRecursive(Node root, int value) {
        if (root == null) return null;
        if (root.value == value) return root;
        return value < root.value ? findRecursive(root.left, value) : findRecursive(root.right, value);

    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left= addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right= addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

}
