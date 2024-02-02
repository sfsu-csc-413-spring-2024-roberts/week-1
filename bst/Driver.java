package bst;

public class Driver {
  public static void main(String[] args) {
    BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();

    for (int i = 0; i < 25; i++) {
      bst.insert((int) Math.floor(Math.random() * 100));
    }

    System.out.println(
        String.format("find(42) is %b", bst.find(42)));

    System.out.println(
        String.format("find(99) is %b", bst.find(99)));

    System.out.println(
        String.format("Tree contains %d nodes", bst.count()));

    System.out.println("--- Preorder ---");
    bst.preorder();
    System.out.println();

    System.out.println("--- Inorder ---");
    bst.inorder();
    System.out.println();

    System.out.println("--- Postorder ---");
    bst.postorder();
    System.out.println();
  }
}
