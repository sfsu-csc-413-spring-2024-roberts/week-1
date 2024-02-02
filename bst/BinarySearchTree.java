package bst;

public class BinarySearchTree<T> {
  private TreeNode<T> root;
  private int nodeCount;

  public BinarySearchTree() {
    this.root = null;
  }

  public void insert(int value) {
    this.nodeCount++;

    if (this.root == null) {
      this.root = new TreeNode<>(value);
    } else {
      this.root.insert(value);
    }
  }

  public boolean find(int value) {
    if (this.root == null) {
      return false;
    } else {
      return this.root.find(value);
    }
  }

  public int count() {
    return this.nodeCount;
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
