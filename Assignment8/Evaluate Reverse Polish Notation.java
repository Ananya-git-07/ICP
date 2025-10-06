class Solution {
    public int evalRPN(String[] tokens){
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String str=tokens[i];
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                 int a=stack.pop();
                 int b=stack.pop();
                 int ans=0;
                if(str.equals("+")){
                    ans=a+b;
                }
                else if(str.equals("-")){
                    ans=b-a;
                }
                else if(str.equals("*")){
                    ans=a*b;
                }
                else if(str.equals("/")){
                    ans=b/a;
                }  
                stack.push(ans);
            }
            else{
                stack.push(Integer.valueOf(str));
            }
         }
        return stack.pop();  
    }
}