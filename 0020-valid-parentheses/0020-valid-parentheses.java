class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(c=='(' ||c=='{' || c=='[')
            {
                stk.push(c);
            }
            else if(!stk.isEmpty() && c==')' && stk.peek()=='(')
            {
                stk.pop();
            }
            else if(!stk.isEmpty() && c==']' && stk.peek()=='[')
            {
                stk.pop();
            }
            else if(!stk.isEmpty() && c=='}' && stk.peek()=='{')
            {
                stk.pop();
            }
            else{
                return false;
            }

        }
        return stk.isEmpty();
    }
}