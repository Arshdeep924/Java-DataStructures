public class Tree { 
    static class Node {    
    int value; 
        Node left, right;           
        Node(int value){ 
            this.value = value; 
            left = null; 
            right = null; 
        } 
    } 
    public void insert(Node node, int value) {
        if (value < node.value) 
        { 
          if (node.left != null) 
          {
             insert(node.left, value); 
            } 
          else { 
            System.out.println(" Inserted " + value + " to left of " + node.value); 
            node.left = new Node(value); } 
          } 
          else if (value > node.value) 
          {
            if (node.right != null) 
            {
              insert(node.right, value);
            }
            else 
            {
              System.out.println("  Inserted " + value + " to right of "+ node.value);
              node.right = new Node(value);
            }
          }
      }

      public void delete(int value) 
      {
          Node parent = null;
          Node current = root;
  
          // Find the node to be deleted and its parent
          while (current != null && current.value != value) {
              parent = current;
              if (value < current.value) {
                      current = current.left;
              } else {
                  current = current.right;
              }
          }
  
          if (current == null) {
              System.out.println("value not found");
              return;
          }
  
          // Case 1: Node has no child (Leaf node)
          if (current.left == null && current.right == null) {
              if (current != root) {
                  if (parent.left == current) {
                      parent.left = null;
                  } else {
                      parent.right = null;
                  }
              } else {
                  root = null;
              }
          }
          // Case 2: Node has one child
          else if (current.left == null || current.right == null) {
              Node child = (current.left != null) ? current.left : current.right;
  
              if (current != root) {
                  if (parent.left == current) {
                      parent.left = child;
                  } else {
                      parent.right = child;
                  }
              } else {
                  root = child;
              }
          }
          // Case 3: Node has two children
          else {
              Node successor = findSuccessor(current);
              int successorKey = successor.value;
              delete(successor.value); // Delete successor
              current.value = successorKey; // Replace current node with successor
          }
      }
  
      // Find the in-order successor (smallest node in the right subtree)
      private Node findSuccessor(Node node)
      {
          Node current = node.right;
          while (current.left != null) {
              current = current.left;
          }
          return current;
      }
     public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
     }
     public void traversePreOrder(Node node) {
      if (node != null) {
          System.out.print(" " + node.value);
          traversePreOrder(node.left);
          traversePreOrder(node.right);
      }
   }
   public void traversePostOrder(Node node) {
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(" " + node.value);

    }
 }
     public static void main(String args[]) 
    { 
    Tree tree = new Tree();
                Node root = new Node(5);
                System.out.println("Binary Tree Example");
                System.out.println("Building tree with root value " + root.value);
                tree.insert(root, 2);
                tree.insert(root, 4);
                tree.insert(root, 8);
                tree.insert(root, 6);
                tree.insert(root, 7);
                tree.insert(root, 3);
                tree.insert(root, 9);
                System.out.println("Traversing tree in order");
                tree.traverseInOrder(root);
                System.out.println("\nTraversing tree Pre order");
                tree.traversePreOrder(root);
                System.out.println("\nTraversing tree Post order");
                tree.traversePostOrder(root);

              }
}

