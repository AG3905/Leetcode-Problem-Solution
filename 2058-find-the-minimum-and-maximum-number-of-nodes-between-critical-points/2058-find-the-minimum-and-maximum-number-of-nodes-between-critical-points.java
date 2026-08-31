/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode rear = head;
        ListNode cur = head.next;
        ListNode front = head.next.next;

        if(rear==null || cur==null || front==null) return new int[]{-1,-1};

        int cnt = 2;
        List<Integer> arr = new ArrayList<>();

        while(front!=null){
            if(rear.val>cur.val && front.val>cur.val){
                arr.add(cnt);
            }
            if(rear.val<cur.val && front.val<cur.val){
                arr.add(cnt);
            }

            cnt++;
            rear = rear.next;
            cur = cur.next;
            front = front.next;
        }

        int max = -1;
        if(arr.size()>=2) max = arr.get(arr.size()-1)-arr.get(0);

        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.size()-1 ; i++){
            if(arr.get(i+1)-arr.get(i)<min){
                min = arr.get(i+1)-arr.get(i);
            }
        }
        if(min==Integer.MAX_VALUE) min = -1;

        return new int[]{min,max};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna