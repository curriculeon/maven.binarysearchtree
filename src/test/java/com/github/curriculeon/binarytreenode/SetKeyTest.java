package com.github.curriculeon.binarytreenode;

import com.github.curriculeon.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SetKeyTest {
    @Test
    public void testSetKey() {
        BinaryTreeNode<Integer, String> node = new BinaryTreeNode<>(5, "five");
        Assert.assertEquals(5, node.getKey().intValue());
        node.setKey(10);
        Assert.assertEquals(10, node.getKey().intValue());
    }

    @Test
    public void testSetNullKey() {
        BinaryTreeNode<Integer, String> node = new BinaryTreeNode<>(5, "five");
        Assert.assertEquals(5, node.getKey().intValue());
        node.setKey(null);
        Assert.assertNull(node.getKey());
    }

    @Test
    public void testSetStringKeys() {
        BinaryTreeNode<String, String> node = new BinaryTreeNode<>("key", "value");
        Assert.assertEquals("key", node.getKey());
        node.setKey("new key");
        Assert.assertEquals("new key", node.getKey());
    }

    @Test
    public void testSetDifferentKeyTypes() {
        BinaryTreeNode<Integer, String> node = new BinaryTreeNode<>(10, "value");
        Assert.assertEquals(10, node.getKey().intValue());
        node.setKey(5);
        Assert.assertEquals(5, node.getKey().intValue());
    }

}
