class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> res=new Stack<>();
        int i=0;
        int j=0;
        while(i<pushed.length){
            res.push(pushed[i]);
            i++;
          while(!res.isEmpty() && j<popped.length && res.peek()==popped[j]){
            res.pop();
            j++;
          }
        }
        if(res.isEmpty()){
            return true;
        }
        return false;
    }
}