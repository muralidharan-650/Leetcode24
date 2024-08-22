class Solution {
    public int arrangeCoins(int n) {
        long val=n*2L;
        long sq=(long)Math.sqrt(val);
        return ((sq*sq+sq)<=val)?(int)sq : (int)(sq-1);
    }
}