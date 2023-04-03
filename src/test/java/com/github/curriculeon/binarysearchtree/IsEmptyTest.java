package com.github.curriculeon.binarysearchtree;

import com.github.curriculeon.BinarySearchTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class IsEmptyTest {


    BinarySearchTree<Integer, String> bst;

    @Before
    public void setUp() {
        bst = new BinarySearchTree<>();
    }

    @Test
    public void testIsEmptyTrue() {
        Assert.assertTrue(bst.isEmpty());
    }

    @Test
    public void testIsEmptyFalse() {
        bst.put(1, "one");
        Assert.assertFalse(bst.isEmpty());
    }

    @Test(expected = NoSuchElementException.class)
    public void testMinException() {
        bst.min();
    }

    @Test(expected = NoSuchElementException.class)
    public void testMaxException() {
        bst.max();
    }
}
