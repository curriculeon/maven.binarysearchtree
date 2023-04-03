package com.github.curriculeon.binarytreenode;

import com.github.curriculeon.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SetLeftTest {
    @Test
    public void testSetLeft() {
        BinaryTreeNode<Integer, String> node = new BinaryTreeNode<>(5, "five");
        BinaryTreeNode<Integer, String> left = new BinaryTreeNode<>(3, "three");
        Assert.assertNull(node.getLeft());
        node.setLeft(left);
        Assert.assertEquals(left, node.getLeft());
    }

    @Test
    public void testSetLeftToNull() {
        BinaryTreeNode<Integer, String> node = new BinaryTreeNode<>(5, "five");
        BinaryTreeNode<Integer, String> left = new BinaryTreeNode<>(3, "three");
        Assert.assertNull(node.getLeft());
        node.setLeft(left);
        Assert.assertEquals(left, node.getLeft());
        node.setLeft(null);
        Assert.assertNull(node.getLeft());
    }

    @Test
    public void testSetLeftToExistingNode() {
        BinaryTreeNode<Integer, String> node = new BinaryTreeNode<>(5, "five");
        BinaryTreeNode<Integer, String> left1 = new BinaryTreeNode<>(3, "three");
        BinaryTreeNode<Integer, String> left2 = new BinaryTreeNode<>(2, "two");
        Assert.assertNull(node.getLeft());
        node.setLeft(left1);
        Assert.assertEquals(left1, node.getLeft());
        node.setLeft(left2);
        Assert.assertEquals(left2, node.getLeft());
    }

    @Test
    public void testSetLeftWithDifferentKeyType() {
        BinaryTreeNode<Integer, String> node = new BinaryTreeNode<>(5, "five");
        BinaryTreeNode<Integer, String> left = new BinaryTreeNode<>(3, "three");
        Assert.assertNull(node.getLeft());
        node.setLeft(left);
        Assert.assertEquals(left, node.getLeft());
    }

}
