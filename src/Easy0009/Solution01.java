package Easy0009;
//Not working.
class Solution01 {
    public boolean isPalindrome(int x)
    {
        String s= String.valueOf(x);
        if(x<0)
            return false;
        if(reverse(s).equals(s))
            return true;
        return false;
    }
    private String reverse(String string)
    {
         char[] chars= string.toCharArray();
        StringBuilder sb= new StringBuilder();
         for(int i=0;i<chars.length/2;i++)
         {
            char temp=chars[i];
            chars[i]=chars[(chars.length-1)-i];
            chars[(chars.length-1)-i]=temp;
         }
         for(char c: chars)
             sb.append(c);
         return sb.toString();
    }
}
