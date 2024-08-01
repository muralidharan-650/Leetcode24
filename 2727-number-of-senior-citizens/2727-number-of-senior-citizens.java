class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++)
        {
            String str=details[i];
            String st=str.substring(11,13);
            int age=Integer.parseInt(st);
            if(age>60)
            {
                count++;
            }
        }
        return count;
    }
}