public class Stackclass{
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class stack {
        public static Node head;
        public static boolean isEmpty() {
            return head == null;
        }
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
        }
    }

    public static void main(String[] args) {
        
    }
}