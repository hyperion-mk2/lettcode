public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode summove = null;
        summove = sum;
        int quick = 0;
        int add = 0;
        int bitsum = 0;
        if (l1 == null){
            sum = l2;
            return sum;
        }
        if (l2 == null){
            sum = l1;
            return sum;
        }
        while (l1!=null&&l2!=null){
            bitsum = add+l1.val+l2.val;
            add = 0;
            if(bitsum >= 10)
            {
                bitsum = bitsum%10;
                add = 1;
            }
            summove.val = bitsum;
            if(l1.next!=null&&l2.next!=null)
            {
            summove.next = new ListNode(0);
            summove = summove.next;
            }
            if(l1.next==null&&l2.next==null&&add==1)
            {
            summove.next = new ListNode(1);
            summove = summove.next;
            }
            l1 = l1.next;
            l2 = l2.next;
            quick = 1;
        }
        if(l1!=null&&quick == 1)
        {
            summove.next = l1;
            while (add == 1)
            {
            l1.val = l1.val + add;
            add = 0;
            if(l1.val >= 10)
            {
                l1.val = l1.val-10;
                add = 1;
                if(l1.next!=null)
                {
                    l1 = l1.next;
                }
                else
                {
                    l1.next = new ListNode(0);
                    l1 = l1.next;
                }
            }

            }
        }
        if(l2!=null&&quick == 1)
        {
            summove.next = l2;
            while (add == 1)
            {
            l2.val = l2.val + add;
            add = 0;
            if(l2.val >= 10)
            {
                l2.val = l2.val-10;
                add = 1;
                if(l2.next!=null)
                {
                  l2 = l2.next;
                }
                else
                {
                l2.next = new ListNode(0);
                l2 = l2.next;
                }
            }
            }
        }
        return sum;
    }
}
