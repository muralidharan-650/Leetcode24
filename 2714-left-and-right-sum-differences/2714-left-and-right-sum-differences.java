class Solution {
    public int[] leftRightDifference(int[] nums) {
         int n = nums.length;
        List<Integer> lSum = new ArrayList<>();
        List<Integer> rSum = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        
        lSum.add(0);
        rSum.add(0);

        
        int d = 0;
        for (int i = 0; i < n - 1; i++) {
            d += nums[i];
            lSum.add(d);
        }

        
        int g = 0;
        for (int i = n - 1; i > 0; i--) {
            g += nums[i];
            rSum.add(g);
        }
        
        
        Collections.reverse(rSum);
        rSum.add(0);

        
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(lSum.get(i) - rSum.get(i));
            result.add(diff);
        }

        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}