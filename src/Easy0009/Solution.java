package Easy0009;
class Solution {
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
        StringBuilder reverse_string= new StringBuilder(string.length());
        char[] chars= string.toCharArray();
        for(int i=chars.length-1;i>=0;i--)
            reverse_string.append(chars[i]);
        return reverse_string.toString();
    }

    //--------------------------------------------//
    public static void main(String[] args)
    {
        int i = 12321;
        Solution s = new Solution();
        if (s.isPalindrome(i))
            System.out.println("True.");
        else
            System.out.println("False.");
    }
}
