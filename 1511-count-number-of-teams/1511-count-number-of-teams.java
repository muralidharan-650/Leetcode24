class Solution {
    public int numTeams(int[] rating) {
        int len=rating.length;
        int count=0;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                for(int k=j+1;k<len;k++)
                {
                    if(rating[i]<rating[j] && rating[j]<rating[k] || rating[i]>rating[j] && rating[j]>rating[k]) 
                    {
                        count++;    
                    }
                }
            }
        }
        return count;
    }
}