package tree;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        int[] ints = {2,5,7,9,6,8,13,17,16};
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree(ints);
        System.out.println(binaryTree.find(2));
    }
}
