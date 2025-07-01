class Node {
    int key;
    Node left, right;
    public Node(int key) 
    {
        this.key = key;
        this.left = this.right = null;
    }
}

class BinarySearchTree {
    private Node root;
   // Insert a node without recursion
    public void insert(int key) 
    {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;
            if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (key < parent.key) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    // Delete a node without recursion
    public void delete(int key) 
    {
        Node parent = null;
        Node current = root;

        // Find the node to be deleted and its parent
        while (current != null && current.key != key) {
            parent = current;
            if (key < current.key) {
                    current = current.left;
            } else {
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("Key not found");
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
            int successorKey = successor.key;
            delete(successor.key); // Delete successor
            current.key = successorKey; // Replace current node with successor
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
    // In-order traversal without recursion (Using Stack)
   /* public void inOrderTraversal() {
        Node current = root;
        java.util.Stack<Node> stack = new java.util.Stack<>();
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.key + " ");
            current = current.right;
        }
    }*/

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.print("In-order Traversal: ");
      //  bst.inOrderTraversal(); // Expected: 20 30 40 50 60 70 80
        System.out.println("\nDeleting 30...");
        bst.delete(30);
        System.out.print("In-order Traversal after deletion: ");
     //   bst.inOrderTraversal(); // Expected: 20 40 50 60 70 80
    }
}
