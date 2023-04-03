package com.github.curriculeon.binarysearchtree;

import com.github.curriculeon.BinarySearchTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class MinTest {
    @Test(expected = NoSuchElementException.class)
    public void testMinWithEmptyBST() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.min();
    }

    @Test
    public void testMinWithSingleElementBST() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(1, "one");
        Assert.assertEquals(1, bst.min().intValue());
    }

    @Test
    public void testMinWithAllPositiveIntegers() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(5, "five");
        bst.put(10, "ten");
        bst.put(15, "fifteen");
        bst.put(2, "two");
        bst.put(1, "one");
        Assert.assertEquals(1, bst.min().intValue());
    }

    @Test
    public void testMinWithAllNegativeIntegers() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(-5, "minus five");
        bst.put(-10, "minus ten");
        bst.put(-15, "minus fifteen");
        bst.put(-2, "minus two");
        bst.put(-1, "minus one");
        Assert.assertEquals(-15, bst.min().intValue());
    }

}
