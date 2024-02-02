package tests.bst;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bst.TreeNode;

public class TreeNodeTest {

  @Test
  public void testGetValue() {
    int testValue = 42;

    TreeNode node = new TreeNode(testValue);

    assertEquals(testValue, node.getValue());
  }

  @Test
  public void testDefaultState() {
    TreeNode node = new TreeNode(42);

    assertNull(node.getLeft());
    assertNull(node.getRight());
  }
}
