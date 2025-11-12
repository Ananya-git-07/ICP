class Solution {
    class Pair{
        Character ch;
        int count;
        Pair(Character ch,int count){
            this.ch=ch;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
       Stack<Pair> st=new Stack<>();
       for(int i=0;i<s.length();i++){
           if(st.isEmpty() || s.charAt(i)!=st.peek().ch){
              st.push(new Pair(s.charAt(i),1));
           }
           else{
              st.push(new Pair(s.charAt(i),st.peek().count+1));
           }
            if(st.peek().count==k){
                int count=k;
                while(count-->0){
                    st.pop();
                }
             }
         }
          String ans="";
          while(!st.isEmpty()){
             ans+=st.pop().ch;
          } 
        ans=new StringBuilder(ans).reverse().toString();
        return ans;
       }
}


    

