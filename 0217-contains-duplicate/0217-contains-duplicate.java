class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        { 
            if(i==0 || nums[i]==nums[i-1])
                count+=1;
        }
        if(count>1)
            return true;
        else 
            return false;
        
    }
}