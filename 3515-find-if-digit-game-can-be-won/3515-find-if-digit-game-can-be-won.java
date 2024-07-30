class Solution {
    public boolean canAliceWin(int[] nums) {
        int len=nums.length;
        int ans=0;
        int ans1=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]<=9)
            {
                ans+=nums[i];
            }
            else{
                ans1+=nums[i];
            }
        }
        return ans!=ans1;
    }
}