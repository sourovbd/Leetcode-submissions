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
    public ListNode middleNode(ListNode head) {
    
        ListNode top = head;
        ListNode newHead = new ListNode();
        StringBuilder sb = new StringBuilder();
        while (top != null) {
            sb.append(top.val+",");
            top = top.next;
        }
        String s = sb.toString();
        System.out.println(s);
        String[] strings = s.split(",");
        int len = strings.length;
        System.out.println("len: "+len);
        int mid = (len/2);
        System.out.println("mid: "+mid);
        int val = Integer.parseInt(strings[mid]);
        System.out.println("Integer.parseInt(strings[mid]): "+Integer.parseInt(strings[mid]));
        System.out.println("val: "+val);

        int count = 0; 
        while (count != mid){
            head = head.next;
            count++;
        }
        newHead = head;
        newHead.next = head.next;
        return newHead;
    }
}