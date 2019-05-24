package exec;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class SUM {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode sum = null;
            ListNode currentNode = null;
            int more = 0;
            int bitSum = 0;
            int k = 0;
            while(l1 != null && l2 != null) {
                bitSum = l1.val + l2.val + more;
                more = bitSum / 10;
                bitSum = bitSum % 10;
                ListNode bitSumNode = new ListNode(bitSum);
                l1 = l1.next;
                l2 = l2.next;
                if(sum == null) {
                    currentNode = bitSumNode;
                    sum = currentNode;
                }
                else {
                    currentNode.next = bitSumNode;
                    currentNode = bitSumNode;
                }
            }
            
            ListNode tl = null;
            
            if(l1 != null) {
                tl = l1;
            }
            
            if(l2 != null) {
               tl = l2;
            }
            
            while(tl != null) {
                bitSum = tl.val + more;
                more = bitSum / 10;
                bitSum = bitSum % 10;
                ListNode bitSumNode = new ListNode(bitSum);
                currentNode.next = bitSumNode;
                currentNode = bitSumNode;
                tl = tl.next;
            }
            
            if(tl == null && more != 0) {
                currentNode.next = new ListNode(more);
            }
            
            return sum;
        }
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
/*        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);*/
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(0);
        SUM sum = new SUM();
        ListNode s = sum.addTwoNumbers(l1, l2);
        while(s != null) {
            System.out.print(s.val);
            s = s.next;
        }
    }

}


