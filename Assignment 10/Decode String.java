class Solution {
    public String decodeString(String s) {
        Stack<String> st=new Stack<>();  
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if (Character.isDigit(c)){
                String temp="";
                while (i<s.length() && Character.isDigit(s.charAt(i))){
                    temp+=s.charAt(i);
                    i++;
                }
                st.push(temp);
                continue;
            } 
            else if(c=='['){
                st.push("[");
                i++;
            } 
            else if(Character.isLetter(c)){
                String t="";
                while (i<s.length() && Character.isLetter(s.charAt(i))) {
                    t+=s.charAt(i);
                    i++;
                }
                st.push(t);
                continue;
            } 
            else if(c ==']'){
            String temp="";
            while(!st.isEmpty() && !st.peek().equals("[")){
               temp=st.pop() + temp; 
              }
            st.pop(); 
            int count=Integer.parseInt(st.pop());
            String str="";
             for(int k=0;k<count;k++){
                str+=temp;
            }
            st.push(str);
              i++;
            } 
            else{
                i++;
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
}
}