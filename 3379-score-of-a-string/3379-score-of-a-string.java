class Solution {
    public int scoreOfString(String s) {
        int res=0;
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            li.add((int)(ch));
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<li.size()-1;i++)
        {
            l.add(Math.abs(li.get(i)-li.get(i+1)));
        }
        int sum=0;
        for(int i=0;i<l.size();i++)
        {
            sum+=l.get(i);
        }
        return sum;
    }
}
            
