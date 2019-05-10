package Easy0007;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int reverse(int x)
    {
        //
        if(x>-10 && x<10)
            return x;
        boolean lessthan0 = false;
        if(x<0)
        {
            lessthan0 = true;
            x=-x;
            if(x==-x)
                return 0;
        }
        List<Integer> list=new ArrayList<Integer>();
        while(x>0)
        {
            list.add(x%10);
            x=x/10;
        }
        long sum=list.get(0);
        //int sum=0;
        for(int i=1;i<list.size();i++)
        {
            //
            sum=sum*10+list.get(i);
            if(sum>Math.pow(2,31)-1)
                return 0;
        }
        if(lessthan0)
            return (int)-sum;
        else
            return (int)sum;
    }
}
