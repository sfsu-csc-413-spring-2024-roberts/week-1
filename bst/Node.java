package bst;

public class Node<ValueType extends Comparable<ValueType>> {
  private ValueType value;
  private Node<ValueType> left, right;

  public Node(ValueType value) {
    this.value = value;
  }

  public ValueType getValue() {
    return this.value;
  }

  public Node<ValueType> getLeft() {
    return this.left;
  }

  public Node<ValueType> getRight() {
    return this.right;
  }

  public int getHeight() {
    return getHeight(this);
  }

  private int getHeight(Node<ValueType> current) {
    if (current == null) {
      return 0;
    }

    int leftHeight = 0;
    if (this.left != null) {
      leftHeight = this.left.getHeight();
    }

    int rightHeight = 0;
    if (this.right != null) {
      rightHeight = this.right.getHeight();
    }

    return 1 + Math.max(leftHeight, rightHeight);
  }

  public void insert(ValueType value) {
    if (value.compareTo(this.value) < 0) {
      if (this.left == null) {
        this.left = new Node<ValueType>(value);
      } else {
        this.left.insert(value);
      }
    } else {
      if (this.right == null) {
        this.right = new Node<ValueType>(value);
      } else {
        this.right.insert(value);
      }
    }
  }

  public boolean find(ValueType value) {
    if (this.value.compareTo(value) == 0) {
      return true;
    } else if (value.compareTo(this.value) < 0 && this.left != null) {
      return this.left.find(value);
    } else if (value.compareTo(this.value) > 0 && this.right != null) {
      return this.right.find(value);
    } else {
      return false;
    }
  }

  public void preorder() {
    System.out.print(this.value + " ");

    if (this.left != null) {
      this.left.preorder();
    }

    if (this.right != null) {
      this.right.preorder();
    }
  }

  public void inorder() {
    if (this.left != null) {
      this.left.inorder();
    }

    System.out.print(this.value + " ");

    if (this.right != null) {
      this.right.inorder();
    }
  }

  public void postorder() {
    if (this.left != null) {
      this.left.postorder();
    }

    if (this.right != null) {
      this.right.postorder();
    }

    System.out.print(this.value + " ");
  }
}