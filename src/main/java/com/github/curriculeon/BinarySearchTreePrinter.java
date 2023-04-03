package com.github.curriculeon;

public class BinarySearchTreePrinter<Key extends Comparable<Key>, Value> {
    private final BinarySearchTree<Key, Value> bst;

    public BinarySearchTreePrinter(BinarySearchTree<Key, Value> bst) {
        this.bst = bst;
    }

    private String printInOrder(BinaryTreeNode<Key, Value> node, StringBuilder sb) {
        if (node != null) {
            printInOrder(node.getLeft(), sb);
            sb.append(node.getKey() + "\n");
            printInOrder(node.getRight(), sb);
        }
        return sb.toString();
    }

    private String printPreOrder(BinaryTreeNode<Key, Value> node, StringBuilder sb) {
        if (node != null) {
            sb.append(node.getKey() + "\n");
            printPreOrder(node.getLeft(), sb);
            printPreOrder(node.getRight(), sb);
        }
        return sb.toString();
    }

    private String printPostOrder(BinaryTreeNode<Key, Value> node, StringBuilder sb) {
        if (node != null) {
            printPostOrder(node.getLeft(), sb);
            printPostOrder(node.getRight(), sb);
            sb.append(node.getKey() + "\n");
        }
        return sb.toString();
    }

    public String printInOrder() {
        return printInOrder(bst.getRoot(), new StringBuilder());
    }

    public String printPreOrder() {
        return printPreOrder(bst.getRoot(), new StringBuilder());
    }

    public String printPostOrder() {
        return printPostOrder(bst.getRoot(), new StringBuilder());
    }
}
