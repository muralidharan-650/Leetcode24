class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        word=word.toLowerCase();
        int c=0;
        int lc=0;
        int dig=0;
        int sp=0;
        int v=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if((ch>='a' && ch<='z'))
            {
                 if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                v+=1;
                }
                else{
                    c++;
                }
                
            }
            else if((ch>='0' && ch<='9'))
            {
                dig+=1;
            }
           
            else{
                sp+=1;
            }
        }
        if((v>0 && c>0)&&(sp==0)) return true;
        else return false;
    }
}