

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class TestObj {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);

        return result;
    }

    public static void main(String[] args) {

        ListNode root = new ListNode(1001);
        ListNode tmp = root;

        System.out.println("root:" + root.val);
        System.out.println("tmp: " + tmp.val);

        tmp = new ListNode(2001);
        System.out.println();
        System.out.println("==>tmp: " + tmp.val);

        System.out.println();
        System.out.println("root:" + root.val);
        root.val = 5001;

        System.out.println();
        System.out.println("root:" + root.val);

        System.out.println();
        System.out.println("==>tmp: " + tmp.val);
        tmp.val = 9001;

        System.out.println();
        System.out.println("==>tmp: " + tmp.val);

        System.out.println();
        System.out.println("root:" + root.val);


    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}