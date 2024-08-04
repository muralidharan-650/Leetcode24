class Solution {
    public int longestMonotonicSubarray(int[] n) {
        List<Integer> li=new ArrayList<>();
        int max=1;
        for(int i=0;i<n.length-1;i++)
        {
            if(n[i]<n[i+1]) 
            {
                max+=1;
            }
            else{
                li.add(max);
                max=1;
            }
           
        }li.add(max);
         max=1;
        for(int i=0;i<n.length-1;i++)
        {
            if(n[i]>n[i+1]) max+=1;
            else{
                li.add(max);
                max=1;
            }
            
        }li.add(max);

        Collections.sort(li);
        return li.get(li.size()-1);
    }
}