public class Day6 {
    public int maxProduct(int[] nums) {
        int MaxNum =0;
        for(int i=0; i<nums.length-1;i++)
        {
            for(int j=i+1; j<nums.length;j++)
            {
                int checkNum = (nums[i]-1)*(nums[j]-1);
                if(MaxNum<checkNum)
                    MaxNum = checkNum;
            }
        }
        return MaxNum;
    }
}
