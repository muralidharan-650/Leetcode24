class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int len=nums.length;
        int j=len-1;
        double res=Integer.MAX_VALUE;
        while(i<j){
            double a=((nums[i]+nums[j])/(2*1.0));
            res=Math.min(res,a);
            i++;
            j--;
        }
        return res;
    }
}