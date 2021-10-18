class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) {
        val = x;
        next = null;
    }
}

public class LeetCode_Q_141 {
    public boolean hasCycle(ListNode1 head) {
       //If head is null return false because there is no node to create cycle.
       //edge case
       if(head == null)
       {
           return false;
       }
        
       //Create two nodes slow and fast pointer which point head
       ListNode1 slow = head;
       ListNode1 fast = head;
        
        //running a loop with three condition
        while(slow != null && fast != null && fast.next != null)
        {
            //Increase slow one time and fast two time.
            slow = slow.next;
            fast = fast.next.next;
            
            //If slow and fast meet same node so this linked list create cycle.
            if(slow == fast)
            {
                return true;
            }
        }
        //if no return false.
        return false;   
    }
}
