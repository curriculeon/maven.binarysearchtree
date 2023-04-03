package com.github.curriculeon.binarytreenode;

import com.github.curriculeon.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SetRightTest {
    @Test
    public void testSetRight() {
        BinaryTreeNode<Integer, String> node = new BinaryTreeNode<>(5, "five");
        BinaryTreeNode<Integer, String> right = new BinaryTreeNode<>(8, "eight");
        Assert.assertNull(node.getRight());
        node.setRight(right);
        Assert.assertEquals(right, node.getRight());
    }

    @Test
    public void testSetRightToNull() {
        BinaryTreeNode<Integer, String> node = new BinaryTreeNode<>(5, "five");
        BinaryTreeNode<Integer, String> right = new BinaryTreeNode<>(8, "eight");
        Assert.assertNull(node.getRight());
        node.setRight(right);
        Assert.assertEquals(right, node.getRight());
        node.setRight(null);
        Assert.assertNull(node.getRight());
    }

    @Test
    public void testSetRightToExistingNode() {
        BinaryTreeNode<Integer, String> node = new BinaryTreeNode<>(5, "five");
        BinaryTreeNode<Integer, String> right1 = new BinaryTreeNode<>(8, "eight");
        BinaryTreeNode<Integer, String> right2 = new BinaryTreeNode<>(10, "ten");
        Assert.assertNull(node.getRight());
        node.setRight(right1);
        Assert.assertEquals(right1, node.getRight());
        node.setRight(right2);
        Assert.assertEquals(right2, node.getRight());
    }

    @Test
    public void testSetRightWithDifferentKeyType() {
        BinaryTreeNode<Integer, String> node = new BinaryTreeNode<>(5, "five");
        BinaryTreeNode<Integer, String> right = new BinaryTreeNode<>(8, "eight");
        Assert.assertNull(node.getRight());
        node.setRight(right);
        Assert.assertEquals(right, node.getRight());
    }

}
