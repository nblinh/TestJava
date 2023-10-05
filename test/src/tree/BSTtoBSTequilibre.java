package tree;

import java.util.ArrayList;
import java.util.List;

// Une classe pour stocker un nœud BST


class BSTtoBSTequilibre {
    // Fonction d'assistance pour effectuer le parcours de préordre sur un BST
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Fonction récursif pour pousser les nœuds d'un arbre de recherche binaire donné dans un
    // liste dans l'ordre
    public static void pushTreeNodes(Node root, List<Node> nodes) {
        // cas de base
        if (root == null) {
            return;
        }

        pushTreeNodes(root.left, nodes);
        nodes.add(root);
        pushTreeNodes(root.right, nodes);
    }

    // Fonction récursif pour construire un BST équilibré en hauteur à partir de
    // nœuds donnés dans l'ordre trié
    public static Node buildBalancedBST(List<Node> nodes, int start, int end) {
        // cas de base
        if (start > end) {
            return null;
        }

        // trouve l'index du milieu
        int mid = (start + end) / 2;

        // Le noeud racine sera un noeud présent au mid-index
        Node root = nodes.get(mid);

        // construit récursivementment les sous-arbres gauche et droit
        root.left = buildBalancedBST(nodes, start, mid - 1);
        root.right = buildBalancedBST(nodes, mid + 1, end);

        // renvoie le nœud racine
        return root;
    }

    // Fonction pour construire un BST équilibré en hauteur à partir d'un BST déséquilibré
    public static Node constructBalancedBST(Node root) {
        // Pousser les nœuds d'un arbre de recherche binaire donné dans une liste dans un ordre trié
        List<Node> nodes = new ArrayList<>();
        pushTreeNodes(root, nodes);

        // Construire un BST équilibré en hauteur à partir de nœuds BST triés
        return buildBalancedBST(nodes, 0, nodes.size() - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(15);
        root.left.left = new Node(10);
        root.left.left.left = new Node(5);
        root.left.left.left.left = new Node(2);
        root.left.left.left.right = new Node(8);

        root = constructBalancedBST(root);

        System.out.print("Preorder traversal of the constructed BST is ");
        preorder(root);
    }
}