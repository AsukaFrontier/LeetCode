package Medium0002;
class Solution {
    private static class ListNode
    {
        int val;
        ListNode next;
        ListNode(int x)
        {
            val=x;
        }
    }
    private int addTwoNumbers(ListNode l1, ListNode l2)
    {
        int sum=0;
        double pow=0;
        ListNode l1_cur= l1;
        ListNode l2_cur= l2;
        while(l1_cur!=null&&l2_cur!=null)
        {

            sum=sum+(l1_cur.val+l2_cur.val)*((int)Math.pow(10.0,pow));
            l1_cur=l1_cur.next;
            l2_cur=l2_cur.next;
            pow++;
        }
        while(l1_cur!=null)
        {
            sum=sum+l1_cur.val*(int)Math.pow(10,pow);
            l1_cur=l1_cur.next;
            pow++;
        }
        while(l2_cur!=null)
        {
            sum=sum+l2_cur.val*(int)Math.pow(10,pow);
            l2_cur=l2_cur.next;
            pow++;
        }
        return sum;
    }
    //--------------------------------------------//
    public static void main(String[] args)
    {
        ListNode ints1=new ListNode(2);
        ListNode ints1_2=new ListNode(4);
        ListNode ints1_3=new ListNode(3);
        ints1.next=ints1_2;
        ints1_2.next=ints1_3;

        ListNode ints2=new ListNode(5);
        ListNode ints2_2=new ListNode(6);
        ListNode ints2_3=new ListNode(4);
        ints2.next=ints2_2;
        ints2_2.next=ints2_3;

        Solution s= new Solution();
        System.out.println(s.addTwoNumbers(ints1,ints2));
    }
}
