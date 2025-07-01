class Node {
    int key;
    Node left, right;
    
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BST {
    Node root;

    public BST() {
        root = null;
    }

    // Insert a node iteratively
    public void insert(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root, parent = null;
        while (current != null) {
            parent = current;
            if (key < current.key)
                current = current.left;
            else
                current = current.right;
        }
        if (key < parent.key)
            parent.left = newNode;
        else
            parent.right = newNode;

    }
    void show(){
            inOrder(root);
        }

    // Search for a node iteratively
    public boolean search(int key) {
        Node current = root;
        while (current != null) {
            if (current.key == key)
                return true;
            current = (key < current.key) ? current.left : current.right;
        }
        return false;
    }

    // Update a node iteratively
    public boolean update(int oldKey, int newKey) {
        Node current = root;
        while (current != null) {
            if (current.key == oldKey) {
                current.key = newKey;
                return true;
            }
            current = (oldKey < current.key) ? current.left : current.right;
        }
        return false; // If oldKey is not found
    }

    // Delete a node iteratively
    public void delete(int key) {
        Node current = root, parent = null;

        while (current != null && current.key != key) {
            parent = current;
            if (key < current.key)
                current = current.left;
            else
                current = current.right;
        }

        if (current == null) return; // Node not found

        // Case 1: Node has no children
        if (current.left == null && current.right == null) {
            if (current == root) 
                root = null;
            else if (parent.left == current) 
                parent.left = null;
            else 
                parent.right = null;
        }
        // Case 2: Node has one child
        else if (current.left == null || current.right == null) {
            Node child = (current.left != null) ? current.left : current.right;
            if (current == root) root = child;
            else if (parent.left == current) parent.left = child;
            else parent.right = child;
        }
        // Case 3: Node has two children
        else {
            Node successorParent = current, successor = current.right;
            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }

            current.key = successor.key;

            if (successorParent.left == successor)
                successorParent.left = successor.right;
            else
                successorParent.right = successor.right;
        }
    
    }

    // In-order Traversal
    public void inOrder(Node node)
    {
            if (node!=null){
            
            inOrder(node.left);  // Visit left subtree
            System.out.print(node.key + " ");  // Print current node
            inOrder(node.right); // Visit right subtree
            }
    }
    

    public static void main(String[] args) {
        BST tree = new BST();        
        // Inserting nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
        tree.show();
        // Searching nodes
     //   System.out.println("Search 40: " + tree.search(40)); // true
     //   System.out.println("Search 100: " + tree.search(100)); // false

        // Updating a node
   //     tree.update(40, 45);
   //     System.out.println("Search 45: " + tree.search(45)); // true

        // Deleting nodes
        System.out.println("\nDeletion of node");
        tree.delete(50);

        tree.show();
//        tree.delete(30);
    //    tree.delete(50);
        // In-order Traversal
       // tree.inOrder();
    }
}
