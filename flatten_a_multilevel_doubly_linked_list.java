
public class flatten_a_multilevel_doubly_linked_list {
    public static void main(String[] args) {
        System.out.println("Simple linked list solution");
    }
}

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    Node(int val){
        this.val = val;
    }
}

class un {
    static class LinkedList {
        public Node header;
        public Node tail;

        LinkedList(Node head) {
            this.header = new Node(head.val);
            this.tail = header;
        }

        void addTail(Node node) {
            Node tempnode = new Node(node.val);
            tail.next = tempnode;
            tempnode.prev = tail;
            tail = tail.next;
        }
    }

    public Node flatten(Node head) {
        if (head == null)
            return head;
        LinkedList linkedList = new LinkedList(head);
        if (head.child != null)
            flattenHelper(linkedList, head.child);
        flattenHelper(linkedList, head.next);
        return linkedList.header;
    }

    private void flattenHelper(LinkedList linkedList, Node root) {
        if (root == null)
            return;
        linkedList.addTail(root);
        if (root.child != null) {
            flattenHelper(linkedList, root.child);
        }
        flattenHelper(linkedList, root.next);
    }
}
