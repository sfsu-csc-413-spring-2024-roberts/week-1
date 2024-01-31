package bst;

public class Node {
  private int value;
  private Node left, right;
  private int height;

  public Node(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public Node getLeft() {
    return this.left;
  }

  public Node getRight() {
    return this.right;
  }

  public int getHeight() {
    return this.height;
  }

  private int getHeight(int current) {
    int leftHeight = this.getLeft().getHeight();
    int rightHeight = this.getRight().getHeight();

    // return current + Math.max(thi, current)
  }

  public void insert(int value) {
    if (value < this.value) {
      if (this.left == null) {
        this.left = new Node(value);
      } else {
        this.left.insert(value);
      }
    } else {
      if (this.right == null) {
        this.right = new Node(value);
      } else {
        this.right.insert(value);
      }
    }
  }
}