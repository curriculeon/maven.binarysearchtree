package com.github.curriculeon.binarysearchtree;


import com.github.curriculeon.BinarySearchTree;
import org.junit.Assert;
import org.junit.Test;


public class SizeTest {
    @Test
    public void testSizeWithEmptyTree() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        Assert.assertEquals(0, bst.size());
    }

    @Test
    public void testSizeWithOneNode() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(1, "one");
        Assert.assertEquals(1, bst.size());
    }

    @Test
    public void testSizeWithMultipleNodes() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(2, "two");
        bst.put(1, "one");
        bst.put(3, "three");
        Assert.assertEquals(3, bst.size());
    }

    @Test
    public void testSizeAfterDeletion() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(2, "two");
        bst.put(1, "one");
        bst.put(3, "three");
        bst.delete(2);
        Assert.assertEquals(2, bst.size());
    }


}
