package com.github.curriculeon.binarysearchtree;

import com.github.curriculeon.BinarySearchTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class MaxTest {

    BinarySearchTree<Integer, String> binarySearchTree;

    @Before
    public void setUp() throws Exception {
        binarySearchTree = new BinarySearchTree<>();
    }

    @Test(expected = NoSuchElementException.class)
    public void testMaxOnEmptyBST() {
        binarySearchTree.max();
    }

    @Test
    public void testMaxOnSingleElementBST() {
        binarySearchTree.put(1, "One");
        Assert.assertEquals(1, (int) binarySearchTree.max());
    }

    @Test
    public void testMaxOnBST() {
        binarySearchTree.put(2, "Two");
        binarySearchTree.put(3, "Three");
        binarySearchTree.put(1, "One");
        Assert.assertEquals(3, (int) binarySearchTree.max());
    }

    @Test
    public void testMaxOnBSTWithDuplicateKeys() {
        binarySearchTree.put(2, "Two");
        binarySearchTree.put(3, "Three");
        binarySearchTree.put(1, "One");
        binarySearchTree.put(3, "Another Three");
        Assert.assertEquals(3, (int) binarySearchTree.max());
    }

}
