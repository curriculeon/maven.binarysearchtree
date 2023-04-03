package com.github.curriculeon.binarysearchtree;

import com.github.curriculeon.BinarySearchTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class DeleteMaxTest {

    @Test(expected = NoSuchElementException.class)
    public void testDeleteMaxWithEmptyTree() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.deleteMax();
    }

    @Test
    public void testDeleteMaxWithOneNode() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(1, "A");
        bst.deleteMax();
        Assert.assertNull(bst.getRoot());
    }

    @Test
    public void testDeleteMaxWithTwoNodes() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(1, "A");
        bst.put(2, "B");
        bst.deleteMax();
        Assert.assertEquals(bst.getRoot().getKey(), (Integer) 1);
    }

    @Test
    public void testDeleteMaxWithMultipleNodes() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(5, "E");
        bst.put(2, "B");
        bst.put(7, "G");
        bst.put(1, "A");
        bst.put(3, "C");
        bst.put(6, "F");
        bst.put(9, "I");
        bst.deleteMax();
        Assert.assertEquals(bst.max(), (Integer) 7);
    }

}
