package org.example.Medium;

public class InsertGreatestCommonDivisorsInLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public class Solution {

        public ListNode insertGreatestCommonDivisors(ListNode head) {
            ListNode prev = head;
            ListNode curr = head.next;

            while (curr != null) {
                int gcdValue = gcd(prev.val, curr.val);

                prev.next = new ListNode(gcdValue, curr);

                prev = curr;
                curr = curr.next;
            }

            return head;
        }

        private int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
    }

}
