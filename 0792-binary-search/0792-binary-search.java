class Solution {
    public int search(int[] nums, int target) {
        int cnt=0;
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                n=1;
                break;
            }
            cnt+=1;
        }
        if(n==1)
        {
            return cnt;
        }
        else{
            return -1;
        }
    }
}