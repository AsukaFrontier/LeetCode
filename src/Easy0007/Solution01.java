package Easy0007;

import java.util.ArrayList;

class Solution01 {
    public int reverse(int xr)
    {
        //
        long x=(long)xr;
        if(x<10&&x>-10)
            return (int)x;
        //
        boolean positiveInt;
        if(x>=0)
            positiveInt=true;
        else
        {
            positiveInt=false;
            x=-x;
        }
        //
        int pow10=0;
        ArrayList<Long> al=new ArrayList<Long>();
        do
        {
            al.add(x%10);
            x/=10;
            pow10++;
        }while(x/10!=0);
        al.add(x%10);
        //
        long int_re=0;
        for(Long i:al)
        {
            int_re=int_re+i*(long)Math.pow(10,pow10);
            pow10--;
        }
        if(int_re>=Math.pow(2,31))
            return 0;
        if(positiveInt)
            return (int) int_re;
        else
            return (int)-int_re;
    }
}
