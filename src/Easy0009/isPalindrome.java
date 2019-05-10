package Easy0009;

public class isPalindrome
{
    public static void main(String[] args)
    {
        int i=12321;
        Solution s= new Solution();
        if(s.isPalindrome(i))
            System.out.println("True.");
        else
            System.out.println("False.");
        //
        Solution01 s01= new Solution01();
        if(s01.isPalindrome(i))
            System.out.println("True.");
        else
            System.out.println("False.");
    }
}
