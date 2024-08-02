class Solution {
    public int isWinner(int[] p1, int[] p2) {
        int sum=0;
        for(int i=0;i<p1.length;i++)
        {
            if(i==1)
            {
                if(p1[i-1]==10) sum+=2*p1[i];
                else sum+=p1[i];
            }
            else if(i>1)
            {
                if(p1[i-1]==10 || p1[i-2]==10)
                {
                    sum+= 2*p1[i];
                }else{
                    sum+=p1[i];
                }
                
            }
            else{
                sum+=p1[i];
            }
        }
        int sum1=0;
        for(int i=0;i<p2.length;i++)
        {
            if(i==1)
            {
                if(p2[i-1]==10) sum1+=2*p2[i];
                else sum1+=p2[i];
            }
            else if(i>1)
            {
                if(p2[i-1]==10 || p2[i-2]==10)
                {
                    sum1+=2*p2[i];
                }else{
                    sum1+=p2[i];
                }
                
            }
            else{
                sum1+=p2[i];
            }
        }
        if(sum>sum1) return 1;
        else if(sum<sum1) return 2;
        else return 0;
    }
}