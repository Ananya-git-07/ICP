class Solution{
    public int calculate(String s) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') continue;
            if(Character.isDigit(s.charAt(i))){
                String temp="";
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    temp+=s.charAt(i++);         
                }    
                i--;   
                st.push(temp); 
            }
            else if(s.charAt(i)=='+' || s.charAt(i)=='-'){
                st.push(String.valueOf(s.charAt(i)));
            }
            else if(s.charAt(i)=='*'){
                int top=Integer.parseInt(st.pop());
                i++;
                while(i<s.length() && s.charAt(i)==' '){
                    i++;
                }
                String temp="";
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    temp+=s.charAt(i++);         
                }
                i--;
                int ans=top*(Integer.parseInt(temp));
                st.push(Integer.toString(ans));
            }
            else if(s.charAt(i)=='/'){
                int top=Integer.parseInt(st.pop());
                i++;
                while(i<s.length() && s.charAt(i)==' '){
                    i++;
                }
                String temp="";
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    temp+=s.charAt(i++);         
                }
                i--;
                int ans=top/(Integer.parseInt(temp));
                st.push(Integer.toString(ans));
            }
        }
        int ans=0;
        Collections.reverse(st);
        while(!st.isEmpty()){
            ans=Integer.parseInt(st.pop());
            if(!st.isEmpty() && st.peek().equals("+")){
               st.pop();
               ans+=Integer.parseInt(st.pop());
               st.push(Integer.toString(ans));
            }
            else if(!st.isEmpty() && st.peek().equals("-")){
               st.pop();
               ans-=Integer.parseInt(st.pop());
               st.push(Integer.toString(ans));
            }
        }
        return ans;
    }
}