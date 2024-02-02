package tests.bst;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bst.Node;

public class NodeTest {
  /**
   * Properties of a node?
   *
   * left and right node (if insert value < value left node is created, etc.)
   * - if no child exists, I should get null
   * height/depth
   */

  @Test
  public void testValue() {
    Node node = new Node(5);

    assertEquals(5, node.getValue());
  }

  @Test
  public void testNoChildren() {
    Node node = new Node(42);

    assertNull(node.getLeft());
    assertNull(node.getRight());
  }

  @Test
  public void testLeftIsLess() {
    Node node = new Node(42);

    node.insert(5);

    assertNull(node.getRight());
    assertNotNull(node.getLeft());
    assertEquals(5, node.getLeft().getValue());
  }

  @Test
  public void testRightIsGreater() {
    Node node = new Node(42);

    node.insert(100);

    assertNull(node.getLeft());
    assertNotNull(node.getRight());
    assertEquals(100, node.getRight().getValue());
  }

  @Test
  public void testGetHeightSingleValue() {
    Node node = new Node(42);

    assertEquals(1, node.getHeight());
  }

  @Test
  public void testGetHeight() {
    Node node = new Node(42);
    node.insert(5);

    assertEquals(2, node.getHeight());
  }
}
