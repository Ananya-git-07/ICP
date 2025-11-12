class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int N=nums.length;
         Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        for(int i=2*N-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i%N]>=stack.peek()){
                stack.pop();
            }
            if(i<N){
                if(stack.isEmpty()){
                    res[i]=-1;
                }
                else{
                    res[i]=stack.peek();
                }
            }
            stack.push(nums[i%N]);
        }
        return res;
    }
}
