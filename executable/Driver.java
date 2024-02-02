package executable;

import bst.BinarySearchTree;

public class Driver {
  public static void main(String[] args) {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();

    for (int i = 0; i < 25; i++) {
      tree.insert((int) Math.floor(Math.random() * 100));
    }

    System.out.println(
        String.format("Is %d in tree: %s", 42, tree.find(42) ? "yes" : "no"));

    System.out.println("-- preorder --");
    tree.preorder();
    System.out.println();

    System.out.println("-- inorder --");
    tree.inorder();
    System.out.println();

    System.out.println("-- postorder --");
    tree.postorder();
    System.out.println();

    BinarySearchTree<String> stringTree = new BinarySearchTree<>();
    stringTree.insert("hello");
    stringTree.insert("world");
    stringTree.insert("abcdef");

    System.out.println("-- String tree inorder --");
    stringTree.inorder();
    System.out.println();

  }
}
