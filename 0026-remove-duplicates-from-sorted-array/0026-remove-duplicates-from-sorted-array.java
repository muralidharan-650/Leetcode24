class Solution {
    public int removeDuplicates(int[] nums) {
        int max;
        int v=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[v]!=nums[i]){

                nums[v+1]=nums[i];
                v++;
                }
        }
        return v+1;
    }
}