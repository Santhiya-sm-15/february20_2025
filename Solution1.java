class Solution {
    public boolean f(StringBuilder s,int n,Set<String> st)
    {
        if(s.length()==n)
        {
            if(!st.contains(s.toString()))
                return true;
            return false;
        }
        s.append('0');
        if(f(s,n,st))
            return true;
        s.setCharAt(s.length()-1,'1');
        if(f(s,n,st))
            return true;
        s.deleteCharAt(s.length()-1);
        return false;
    }
    public String findDifferentBinaryString(String[] nums) {
        Set<String> s=new HashSet<>();
        for(String x:nums)
            s.add(x);
        StringBuilder x=new StringBuilder();
        f(x,nums.length,s);
        return x.toString();
    }
}