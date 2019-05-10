package Easy0014;

public class Solution {
    public String longestCommonPrefix(String[] strs)
    {
        if(strs==null||strs.length==0)
            return "";
        if(strs.length==1)
            return strs[0];
        //
        String min_string=findMinString(strs);
        String longest_common_prefix="";
        for(int i=0;i<min_string.length();i++)
        {
            if(prefixMatch(strs,min_string.substring(0,i+1)))
                longest_common_prefix=min_string.substring(0,i+1);
        }
        return longest_common_prefix;
    }
    private boolean prefixMatch(String[] strs, String prefix)
    {
        for(int i=0;i<strs.length;i++)
        {
            if(!strs[i].startsWith(prefix))
                return false;
        }
        return true;
    }
    private String findMinString(String[] strs)
    {
        int min_string_length=strs[0].length();
        int min_string_index=0;
        for(int i=0;i<strs.length;i++)
        {
            if(min_string_length>=strs[i].length())
                min_string_index=i;
        }
        return strs[min_string_index];
    }
    //---------------------------------------------------------------
    public static void main(String[] args)
    {
        String[] string1={"This","That","Those","These","Th"};
        Solution s1= new Solution();
        System.out.println(s1.longestCommonPrefix(string1));
        String[] string2={"When","Why","Whether","How"};
        Solution s2= new Solution();
        System.out.println(s2.longestCommonPrefix(string2));
    }
}
