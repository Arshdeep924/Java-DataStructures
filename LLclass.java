class LL {
    // // // ALL LINKED LISTS FUNCTIONS FROM SCRATCH, COLLECTION FRAMEWORK STARTS WHERE THIS ENDS
    Node head;
    // // // to calculate size of LL, we make a size variable
    private int size;

    LL() { // constructor to initialize size as 0, size++ whenever add and size-- whenever we delete
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // // 1) add operation - at first
    public void addFirst(String data) {
        // checking for head node if null
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return; 
        }
        // make the newNode's pointer the previous head node and newNode as new head node
        newNode.next = head;
        head =newNode;
    } 

    // // 2) add operation - at last
    // public void addLast(String data) {
    //     Node newNode = new Node(data);
    //     // checking for head node if null
    //     if(head ==  null) {
    //         head = newNode;
    //         return;
    //     }
    //     // traversal to the last node to find node pointing to null
    //     // making head node into current node and then traversing, as we should'nt manipulate with head node directly
    //     Node currNode = head;
    //     while(currNode.next != null) {
    //         currNode = currNode.next; 
    //     }
    //     // now when we reach null(where loop has ended), we make it equal to the new node and new node(from addLast) already points to null
    //     currNode.next = newNode;
    // }
    // // now printing the list
    // public void printList() {
    //     if(head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     Node currNode = head;
    //     while(currNode != null) {
    //         System.out.print(currNode.data + " -> ");
    //         currNode = currNode.next;
    //     }
    //     System.out.println("NULL");
    // }

    // // 3) delete operation - at first
    // public void deleteFirst() {
    //     if(head == null) {
    //         System.out.println("The list is empty");
    //         return;
    //     }
    //     size--;
    //     head = head.next; 
    // }
    // // 4) delete operation - at last
    // public void deleteLast() {
    //     if(head ==  null) {
    //         System.out.println("The list is empty");
    //         return;
    //     }
    //     size--; //it is specified here to protect the corner condition below
    //     // in case LL has only one node and thus, next node to head is null
    //     if(head.next == null) {
    //         head = null;
    //         return;
    //     }

    //     Node secondLast = head;
    //     Node lastNode = head.next;
    //     while(lastNode.next != null) {
    //         // note - loop stops when lastNode.next reaches null, hence the secondLast.next will also not traverse further
    //         // and actually stop at second last node
    //         lastNode = lastNode.next;
    //         secondLast = secondLast.next;
    //     }
        
    //     secondLast.next = null;
    // }
    // // 5) to get size of LL
    // public int getSize(){
    //     return size;
    // }

    // // main function
    // public static void main(String[] args) {
    //     LL list = new LL();
    //     // 1)
    //     list.addFirst("a");
    //     list.addFirst("is");
    //     list.addFirst("This");
    //     list.printList(); 
    //     // 2)
    //     list.addLast("list");
    //     list.printList(); 
    //     // 3)
    //     list.deleteFirst();
    //     list.printList();
    //     // 4)
    //     list.deleteLast();
    //     list.printList();
    //     // 5)
    //     System.out.println(list.getSize());
    // }

    // // USING JAVA COLLECTION FRAMEWORK---------------------------------
    // public static void main(String[] args) {
    //     LinkedList<String> list = new LinkedList<String>();
    //     list.addFirst("a");           // to add elements at start
    //     list.addFirst("is");
    //     list.addFirst("This");
    //     list.addLast("list");         // to add at last
    //     System.out.println(list);
    //     System.out.println(list.size()); // to get size of LL
    //     for (int i = 0; i < list.size(); i++) {
    //         System.out.print(list.get(i) + " "); // to print the list
    //     }
    //     System.out.println("NUll"); // to add Null at last
    // }

    // ---------------------------------------------------------------------------------------------------------------
    // Ques - Make a linked list and add the following elements to it - (1,5,7,3,8,2,3). Search for no 7 and display it
    // public static void main(String[] args) {
    //     LinkedList<Integer> list = new LinkedList<Integer>();
    //     list.addFirst(3);
    //     list.addFirst(2);
    //     list.addFirst(8);
    //     list.addFirst(3);
    //     list.addFirst(7);
    //     list.addFirst(5);
    //     list.addFirst(1);
    //     System.out.println(list);
    //     System.out.println(list.indexOf(7));
    // }
    // ----------------------------------------------------------------------------------------------------------------
    // Ques - Take input elements in the range of 1-50 of a linked list. Delete all nodes with values greater than 25 - 
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     LinkedList<Integer> list = new LinkedList<Integer>();
    //     System.out.println("Enter numbers within 1 - 50. Type -1 to stop: ");
    //     while (true) {
    //         int num = sc.nextInt();
    //         if(num == -1) {
    //             break;
    //         }else if(num >= 1 && num <= 50) {
    //             list.add(num);
    //         }else {
    //             System.out.println("Invalid input, enter an integer from 1 to 50");
    //         }
    //     }
    //     System.out.println("Entered List: " + list);  
    //     Iterator<Integer> iter = list.iterator();
    //     while (iter.hasNext()) {
    //         if (iter.next() > 25) {
    //             iter.remove();
    //         }
    //     }
    //     System.out.println("Updated LL: " + list);
    // }
    // ---------------------------------------------------------------------------------------------------------------------

    // // REVERSING A LINKED LIST ITERATIVELY - USE PREVIOUS FUNCTIONS FOR ADDING TO A LINKED LIST
    // // MAKE MAIN FUNCTION AGAIN AND UNCOMMENT THE FROM SCRATCH MADE CODE
    // public void reverseIterate() {
    //     // corner cases first
    //     if(head == null || head.next == null) {
    //         return;
    //     }
    //     Node prevNode = head;
    //     Node currNode = head.next;
    //     while(currNode != null) {
    //         Node nextNode = currNode.next;
    //         currNode.next = prevNode;
    //         // Updating
    //         prevNode = currNode;
    //         currNode = nextNode;
    //     }
    //     head.next = null;
    //     head = prevNode;
    // }

    // public static void main(String[] args) {
    //     LL list = new LL();
    //     list.addLast("1");
    //     list.addLast("2");
    //     list.addLast("3");
    //     list.addLast("4");
    //     list.printList();
    //     list.reverseIterate();
    //     list.printList();
    // }

    // // REVERSING A LINKED LIST RECURSIVELY
    // public Node reverseRecursive(Node head) {

    //     if(head == null || head.next == null) {
    //         return head; 
    //     }

    //     Node newHead = reverseRecursive(head.next);
    //     head.next.next = head;
    //     head.next = null;
    //     return newHead;
    // }
    // public static void main(String[] args) {
    //         LL list = new LL();
    //         list.addLast("1");
    //         list.addLast("2");
    //         list.addLast("3");
    //         list.addLast("4");
    //         list.printList();
    //         list.head = list.reverseRecursive(list.head);
    //         list.printList();
    //     }

    // MOST IMPORTANT QUESTIONS
    // Q1) Find the nth node from the last and delete it
 
    // public ListNode removeNthFromEnd(ListNode head, int n){
    //     if(head.next == null) {
    //         return null;
    //     }
    //     // finding size
    //     int size = 0;
    //     ListNode curr = head;
    //     while(curr != null){
    //         curr = curr.next;
    //         size++;
    //     }
    //     if(n == size){
    //         return head.next;
    //     }
    //     // finding previous node
    //     int indexToSearch = size - n;
    //     ListNode prev = head;
    //     int i = 1;
    //     while(i < indexToSearch) {
    //         prev = prev.next;
    //         i++;
    //     }
    //     // assigning previous node as the node next to target node in order to delete the target node 
    //     prev.next = prev.next.next;
    //     return head;
    // }
    // public static void main(String[] args) {
    //     LinkedList<Integer> list = new LinkedList<Integer>();
    //     list.addLast(1);
    //     list.add(2);
    //     list.add(3);
    //     list.add(4);
    //     list.add(5);
    //     for (int i = 0; i < list.size(); i++) {
    //         System.out.print(list.get(i) + " ");
    //     }

    }







