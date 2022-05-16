public class myLinkedList {
    private Node head;
//    private Node next;

    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    void addFirst(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    void printList() {
        if (this.head == null) {
            System.out.println("Empty List!");
        }
        Node tmpNode = this.head;
        while (tmpNode != null) {
            System.out.print(tmpNode.data + " -> ");
            tmpNode = tmpNode.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        myLinkedList root = new myLinkedList();
        System.out.println("root: ");
        root.printList();

        myLinkedList l1 = root;

//        l1.addFirst(0);
//        l1.addFirst(1);

        l1.head = new Node(0);
        int counter = 0;
        while (l1.head != null) {
            l1.head.next = new Node(counter);
            l1.head = l1.head.next;
            System.out.print(l1.head.data + ", ");
            if (counter < 5)
                counter++;
            else
                break;

        }

        System.out.println("Root: ");
        root.printList();

    }
}