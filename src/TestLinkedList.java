import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        LinkedList<Integer> l3 = new LinkedList<Integer>();

        LinkedList<Integer> l2 = ll;

        System.out.println(ll);

        System.out.println(l2);


        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);

        System.out.println("ll: " + ll);
        System.out.println("l2: " + l2);
        System.out.println("l3: " + l3);

        l2 = l3;

        l3.add(3001);

        System.out.println("ll: " + ll);
        System.out.println("l2: " + l2);
        System.out.println("l3: " + l3);

        ll.add(2001);
        ll.add(2002);

        System.out.println();
        System.out.println(ll);
        System.out.println(l2);
        System.out.println(l3);

    }
}

