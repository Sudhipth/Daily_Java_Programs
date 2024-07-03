package Daily_Problem;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class M {
    public ListNode mergeNodes(ListNode head) {
        ArrayList<Integer> l = new ArrayList<>();

        while (head != null) {
            int sum = 0;
            if (head.val == 0) {
                ListNode temp = head.next;
                while (temp != null) {
                    if (temp.val != 0) {
                        sum += temp.val;
                    } else {
                        break;
                    }
                    temp = temp.next;
                }
                l.add(sum);
                head = temp;
            }
        }

        ListNode tail = null;
        int i = 0;
        ListNode newHead = null; // Initialize newHead for the new list
        while (i != l.size()) {
            ListNode nn = new ListNode(l.get(i));
            i++;
            if (newHead == null) {
                newHead = nn;
                tail = nn;
            } else {
                tail.next = nn;
                tail = tail.next;
            }
        }
        return newHead; // Return the head of the new list
    }
}

public class Solution {
    public static void main(String[] args) {
        // Create the example linked list: 0 -> 3 -> 1 -> 0 -> 4 -> 5 -> 2 -> 0 -> 1 -> 0
        ListNode head = new ListNode(0);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next.next.next.next = new ListNode(0);

        // Merge nodes and print the result
        M solution = new M();
        ListNode result = solution.mergeNodes(head);

        // Print the result linked list
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.print("null");
    }
}
