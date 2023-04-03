package com.github.curriculeon.binarysearchtree;

import com.github.curriculeon.BinarySearchTree;
import org.junit.Assert;
import org.junit.Test;

public class PutTest {

    @Test
    public void testPutAddsElementToEmptyTree() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(1, "one");
        Assert.assertEquals("one", bst.get(1));
    }

    @Test
    public void testPutAddsElementToNonEmptyTree() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(1, "one");
        bst.put(2, "two");
        Assert.assertEquals("one", bst.get(1));
        Assert.assertEquals("two", bst.get(2));
    }

    @Test
    public void testPutOverwritesExistingValue() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(1, "one");
        bst.put(1, "newOne");
        Assert.assertEquals("newOne", bst.get(1));
    }
}
