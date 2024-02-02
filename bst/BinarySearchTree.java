package bst;

public class BinarySearchTree<ValueType extends Comparable<ValueType>> {
  private Node<ValueType> root;

  public BinarySearchTree() {
    this.root = null;
  }

  public void insert(ValueType value) {
    if (this.root == null) {
      this.root = new Node<ValueType>(value);
    } else {
      this.root.insert(value);
    }
  }

  public int getHeight() {
    if (this.root == null) {
      return 0;
    } else {
      return this.root.getHeight();
    }
  }

  public boolean find(ValueType value) {
    return this.root != null && this.root.find(value);
  }

  public void preorder() {
    if (this.root == null) {
      return;
    }

    this.root.preorder();
  }

  public void inorder() {
    if (this.root == null) {
      return;
    }

    this.root.inorder();
  }

  public void postorder() {
    if (this.root == null) {
      return;
    }

    this.root.postorder();
  }
}
