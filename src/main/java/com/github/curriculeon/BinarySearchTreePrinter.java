package com.github.curriculeon;

public class BinarySearchTreePrinter<Key extends Comparable<Key>, Value> {
    private final BinarySearchTree<Key, Value> bst;

    public BinarySearchTreePrinter(BinarySearchTree<Key, Value> bst) {
        this.bst = bst;
    }

    private String printInOrder(BinarySearchTreeNode<Key, Value> node, StringBuilder sb) {
        if (node == null) {
            return sb.toString();
        }
        printInOrder(node.getLeft(), sb);
        sb.append(node.toString()).append(" ");
        printInOrder(node.getRight(), sb);
        return sb.toString();
    }

    private String printPreOrder(BinarySearchTreeNode<Key, Value> node, StringBuilder sb) {
        if (node == null) {
            return sb.toString();
        }
        sb.append(node.toString()).append(" ");
        printPreOrder(node.getLeft(), sb);
        printPreOrder(node.getRight(), sb);
        return sb.toString();
    }

    private String printPostOrder(BinarySearchTreeNode<Key, Value> node, StringBuilder sb) {
        if (node == null) {
            return sb.toString();
        }
        printPostOrder(node.getLeft(), sb);
        printPostOrder(node.getRight(), sb);
        sb.append(node.toString()).append(" ");
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