class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> li=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                li.add(nums[i]);
            }
        }
        int j=1;
        while(li.contains(j)){
            j++;
        }
        return j;
    }
}