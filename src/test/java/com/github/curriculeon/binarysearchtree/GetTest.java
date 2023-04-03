package com.github.curriculeon.binarysearchtree;

import com.github.curriculeon.BinarySearchTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;
public class GetTest {

    @Test
    public void testGetExistingKey() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(1, "one");
        bst.put(2, "two");
        bst.put(3, "three");
        Assert.assertEquals("two", bst.get(2));
    }

    @Test
    public void testGetNonExistingKey() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(1, "one");
        bst.put(2, "two");
        bst.put(3, "three");
        Assert.assertNull(bst.get(4));
    }

    @Test
    public void testGetRoot() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(1, "one");
        Assert.assertEquals("one", bst.get(bst.getRoot().getKey()));
    }

    @Test
    public void testGetEmptyTree() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        Assert.assertNull(bst.get(1));
    }

}

