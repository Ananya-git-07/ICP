class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
         for(int i=0;i<num.length();i++){
             int digit=num.charAt(i)-'0'; 
             if(st.isEmpty()){
                st.push(digit);
             }
             else{
                while(!st.isEmpty() && k>0 && st.peek()>digit){
                    st.pop();
                    k--;
                }
               st.push(digit);
             } 
         }
        StringBuilder res=new StringBuilder();
        while(k>0 && !st.isEmpty()){
           st.pop();
           k--;
        }
        for(int ch : st) {
            res.append(ch);
        }
        int i=0;
        while(i<res.length() && res.charAt(i)=='0') {
         res.deleteCharAt(i);
        }
        if(res.toString().equals("")){
            return "0";
        }
        return res.toString();
    }
}