package bst;

public class TreeNode<T> {
  private int value;
  private TreeNode<T> left, right;

  public TreeNode(int value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  public int getValue() {
    return this.value;
  }

  public TreeNode<T> getLeft() {
    return this.left;
  }

  public TreeNode<T> getRight() {
    return this.right;
  }

  public void insert(int value) {
    if (value < this.value) {
      if (this.left == null) {
        this.left = new TreeNode<>(value);
      } else {
        this.left.insert(value);
      }
    } else {
      if (this.right == null) {
        this.right = new TreeNode<>(value);
      } else {
        this.right.insert(value);
      }
    }
  }

  public boolean find(int value) {
    if (this.value == value) {
      return true;
    } else if (value < this.value) {
      return this.left != null && this.left.find(value);
    } else {
      return this.right != null && this.right.find(value);
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
