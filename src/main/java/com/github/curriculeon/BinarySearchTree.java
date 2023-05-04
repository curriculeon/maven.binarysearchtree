package com.github.curriculeon;

import java.util.NoSuchElementException;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private BinarySearchTreeNode<Key, Value> root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    private Value get(BinarySearchTreeNode<Key, Value> x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.getKey());
        if (cmp < 0) {
            return get(x.getLeft(), key);
        } else if (cmp > 0) {
            return get(x.getRight(), key);
        } else {
            return x.getValue();
        }
    }

    private BinarySearchTreeNode<Key, Value> put(BinarySearchTreeNode<Key, Value> x, Key key, Value value) {
        if (x == null) {
            size++;
            return new BinarySearchTreeNode<Key, Value>(key, value);
        }
        int cmp = key.compareTo(x.getKey());
        if (cmp < 0) {
            x.setLeft(put(x.getLeft(), key, value));
        } else if (cmp > 0) {
            x.setRight(put(x.getRight(), key, value));
        } else {
            x.setValue(value);
        }
        return x;
    }

    private BinarySearchTreeNode<Key, Value> min(BinarySearchTreeNode<Key, Value> x) {
        if (x.getLeft() == null) {
            return x;
        } else {
            return min(x.getLeft());
        }
    }

    private BinarySearchTreeNode<Key, Value> max(BinarySearchTreeNode<Key, Value> x) {
        if (x.getRight() == null) {
            return x;
        } else {
            return max(x.getRight());
        }
    }

    private BinarySearchTreeNode<Key, Value> deleteMin(BinarySearchTreeNode<Key, Value> x) {
        if (x.getLeft() == null) {
            return x.getRight();
        }
        x.setLeft(deleteMin(x.getLeft()));
        return x;
    }

    private BinarySearchTreeNode<Key, Value> deleteMax(BinarySearchTreeNode<Key, Value> x) {
        if (x.getRight() == null) {
            size--;
            return x.getLeft();
        }
        x.setRight(deleteMax(x.getRight()));
        return x;
    }

    private BinarySearchTreeNode<Key, Value> delete(BinarySearchTreeNode<Key, Value> x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.getKey());
        if (cmp < 0) {
            x.setLeft(delete(x.getLeft(), key));
        } else if (cmp > 0) {
            x.setRight(delete(x.getRight(), key));
        } else {
            if (x.getLeft() == null) {
                size--;
                return x.getRight();
            } else if (x.getRight() == null) {
                size--;
                return x.getLeft();
            } else {
                BinarySearchTreeNode<Key, Value> t = x;
                x = min(t.getRight());
                x.setRight(deleteMin(t.getRight()));
                x.setLeft(t.getLeft());
            }
        }
        return x;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public BinarySearchTreeNode<Key, Value> getRoot() {
        return root;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    public Key min() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }
        return min(root).getKey();
    }

    public Key max() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }
        return max(root).getKey();
    }

    public void deleteMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }
        root = deleteMin(root);
        size--;
    }

    public void deleteMax() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }
        root = deleteMax(root);
        size--;
    }

    public void delete(Key key) {
        root = delete(root, key);
    }
}
