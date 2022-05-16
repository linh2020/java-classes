/*
public class AddTwoNumbers_2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode tmp = root;
        ListNode emptyNode = new ListNode(0);

        int carry = 0;
        int sum = 0;

        int v1, v2;


        while (l1 != null || l2 != null) {
            v1 = l1 != null ? l1.val : 0;
            v2 = l2 != null ? l2.val : 0;

            sum = v1 + v2 + carry;

            tmp.next = new ListNode(sum % 10);
            //tmp = new ListNode(sum%10);
            tmp = tmp.next;
            carry = sum / 10;

            // l1 = (l1.next!=null)? l1.next: emptyNode;
            // l2 = (l2.next!=null)? l2.next: emptyNode;


            if (l1 != null)
                l1 = l1.next;

            if (l2 != null)
                l2 = l2.next;

        }

        // if (carry>0){
        //         tmp.next = new ListNode(carry);
        //         tmp = tmp.next;
        // }

        if (sum > 9) {
            tmp.next = new ListNode(sum / 10);
            tmp = tmp.next;
        }


        return root.next;
    }
 */


import java.util.List;

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
public class AddTwoNumbers_2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode tmp = root;
        ListNode emptyNode = new ListNode(0);

        int carry = 0;
        int sum = 0;

        int v1, v2;


        while (l1 != null || l2 != null) {
            v1 = l1 != null ? l1.val : 0;
            v2 = l2 != null ? l2.val : 0;

            sum = v1 + v2 + carry;

            tmp.next = new ListNode(sum % 10);
            //tmp = new ListNode(sum%10);
            tmp = tmp.next;
            carry = sum / 10;

            // l1 = (l1.next!=null)? l1.next: emptyNode;
            // l2 = (l2.next!=null)? l2.next: emptyNode;


            if (l1 != null)
                l1 = l1.next;

            if (l2 != null)
                l2 = l2.next;

        }

        // if (carry>0){
        //         tmp.next = new ListNode(carry);
        //         tmp = tmp.next;
        // }

        if (sum > 9) {
            tmp.next = new ListNode(sum / 10);
            tmp = tmp.next;
        }


        return root.next;
    }

    static void printList(ListNode list) {
//        if (list.val == ) {
//            System.out.println("Empty List!");
//        }
        while (true) {
            System.out.print(list.val + " -> ");
            if (list.next != null)
                list = list.next;
            else
                break;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);
        printList(result);
    }
}

//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}