package com.github.curriculeon.binarytreenode;

import com.github.curriculeon.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SetValueTest {
    @Test
    public void testSetValue() {
        BinaryTreeNode<Integer, String> node = new BinaryTreeNode<>(5, "five");
        Assert.assertEquals("five", node.getValue());
        node.setValue("new five");
        Assert.assertEquals("new five", node.getValue());
    }

    @Test
    public void testSetNullValue() {
        BinaryTreeNode<Integer, String> node = new BinaryTreeNode<>(5, "five");
        Assert.assertEquals("five", node.getValue());
        node.setValue(null);
        Assert.assertNull(node.getValue());
    }

    @Test
    public void testSetStringValues() {
        BinaryTreeNode<String, String> node = new BinaryTreeNode<>("key", "value");
        Assert.assertEquals("value", node.getValue());
        node.setValue("new value");
        Assert.assertEquals("new value", node.getValue());
    }

    @Test
    public void testSetDifferentValueTypes() {
        BinaryTreeNode<Integer, Object> node = new BinaryTreeNode<>(10, 123);
        Assert.assertEquals(123, node.getValue());
        node.setValue("new value");
        Assert.assertEquals("new value", node.getValue());
    }

}
