class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String ans="";
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='/'){
                continue;
            }
            String temp="";
            while(i<path.length() && path.charAt(i)!='/'){
                temp+=path.charAt(i);
                i++;
            } 
            if(temp.equals(".")){
                continue;
            }
            else if(temp.equals("..")){
              if(!stack.isEmpty()){
                stack.pop();
              }
            }
            else{
                stack.push(temp);
            }
        }
        if(stack.isEmpty()) {
            return "/"; 
        } 
        while(!stack.isEmpty()){
            ans='/'+stack.pop()+ans;
        }
        return ans;
    }
}