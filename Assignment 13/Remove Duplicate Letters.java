class Solution {
    public String removeDuplicateLetters(String s) {
        boolean[] visited=new boolean[26];
        Stack<Character> st=new Stack<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.get(s.charAt(i))-1); 
            if(visited[s.charAt(i)-'a']){
               continue;
            }
            else{
                while(!st.isEmpty() && st.peek()>s.charAt(i) && map.get(st.peek())>0){
                    visited[st.pop()-'a']=false;
                }
                st.push(s.charAt(i));
                visited[s.charAt(i)-'a']=true;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
}