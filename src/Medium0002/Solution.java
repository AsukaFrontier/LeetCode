package Medium0002;
//本方案未解决任意长度整数
//任意长度整数可用 BigDecimal类
import java.util.LinkedList;
public class Solution //
{
    //
    LinkedList<ListNode> listOfLN= new LinkedList<>(); //Solution类的字段
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        long num1= listToNum(l1);
        long num2= listToNum(l2);
        long sum= num1+ num2;
        ListNode newHead= intToListNode(sum);
        return newHead;
    }
    private ListNode intToListNode(long num)
    {
        if(num==0)
        {
            ListNode lstZero= new ListNode(0);
            return lstZero;
        }
        //商:   quotient
        //余数: remainder
        while(num!=0)
        {
            long quotient= num/10;
            long remainder= num%10;
            ListNode current= new ListNode((int)remainder);
            listOfLN.add(current);
            num= quotient;
        }
        ListNode head= listOfLN.removeFirst();
        ListNode current= head;
        while(!listOfLN.isEmpty())
        {
            current.next= listOfLN.removeFirst();
            current= current.next;
        }
        return head;
    }
    private long listToNum(ListNode l1)
    {
        ListNode currentNode= l1;
        long decimalOrder= 0;
        long number= 0;
        while(currentNode!=null)
        {
            number= number+currentNode.val*(long)Math.pow(10, decimalOrder);
            decimalOrder++;
            currentNode= currentNode.next;
        }
        return number;
    }
    //---------UNIT TEST--------------------------//
    public static void main(String[] args)
    {
        //
        ListNode l2= new ListNode(2);
        ListNode l4= new ListNode(4);
        ListNode l3= new ListNode(3);
        ListNode r5= new ListNode(5);
        ListNode r6= new ListNode(6);
        ListNode r4= new ListNode(4);
        l2.next= l4;
        l4.next= l3;
        r5.next= r6;
        r6.next= r4;
        Solution s= new Solution();
        ListNode lst= s.addTwoNumbers(l2, r5);
        while(lst!=null)
        {
            System.out.print(lst.val+" ");
            lst=lst.next;
        }
    }
}
class ListNode //包可见的类, 与Solution类在同一文件内
{
    int val;
    ListNode next;
    ListNode(int x)
    {
        val=x;
    }
}
