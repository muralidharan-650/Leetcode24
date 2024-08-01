class Solution {
    public int diagonalPrime(int[][] arr) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int one=arr[i][i];
            int two=arr[i][arr.length-i-1];
            li.add(one);
            li.add(two);
        }
        Collections.sort(li);
        for(int i=li.size()-1;i>=0;i--)
        {
            if(pri(li.get(i)))
            {
                return li.get(i);
            }
        }
        return 0;
    }
         static boolean pri(int n)
        {
            if(n==1)
                return false;
            else{
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                    return false;
            }
            return true;
        }
        }
    
}