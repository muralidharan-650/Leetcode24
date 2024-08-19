class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
  
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> m=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        r(li,m,nums,n,0);
        return li;

    }
    public void r(List<List<Integer>> li,List<Integer> m,int[] nums,int n,int i)
    {
        if(n==i)
        {
            if(!li.contains(m)){
            li.add(new ArrayList<>(m));
        }
        }
        else{
            m.add(nums[i]);
            r(li,m,nums,n,i+1);
            m.remove(m.size()-1);
            r(li,m,nums,n,i+1);
        }
    }
}
