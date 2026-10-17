class Solution {

    public ListNode sortList(ListNode head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split list
        ListNode mid = getMid(head);

        // Step 2: Sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        // Step 3: Merge
        return merge(left, right);
    }

    // Find middle and split
    public ListNode getMid(ListNode head) {

        ListNode slow = head, fast = head, prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // break the list into two halves
        prev.next = null;

        return slow;
    }

    // Merge two sorted lists
    public ListNode merge(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        // Attach remaining
        curr.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }
}
