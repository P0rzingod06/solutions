class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1,l2,0);
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {

        if(l1 == null && l2 == null && carry == 0) {
            return null;
        }
        
        int newValue = l1.val + l2.val + carry;
            
        if(newValue >= 10) {
            carry = 1;
        } else {
            carry = 0;
        }
        
        ListNode result = new ListNode(newValue % 10);
        
        if(l1.next != null || l2.next != null || carry != 0)
            result.next = addTwoNumbers(l1.next,l2.next,carry);
        
        return result;
    }
}
