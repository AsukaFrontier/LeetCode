package Easy0001;
public class Easy0001 {
    public static int[] twoSum(int[] nums, int target)
    {
        //
        int[] answerIndex=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]+nums[j]==target)
                {
                    //
                    answerIndex[0]=i;
                    answerIndex[1]=j;
                }
        }
        return answerIndex;
    }
    public static void main(String[] args)
    {
        //
        int[] nums={2,7,11,15};
        int target=13;
        int[] sum_index=twoSum(nums, target);
        for(int index: sum_index)
            System.out.println(index);
    }
}
