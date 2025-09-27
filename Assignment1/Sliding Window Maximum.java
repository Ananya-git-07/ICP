class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=0;
        int r=k-1;
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=r;i++){
            max=Math.max(nums[i],max);
        }
        list.add(max);
       while(r<nums.length-1){
         max=Integer.MIN_VALUE;
          l++;
          r++;
          for(int i=l;i<=r;i++){
             max=Math.max(nums[i],max);
          }
          list.add(max);
       }
       int[] arr=new int[list.size()];
       for(int i=0;i<list.size();i++){
         arr[i]=list.get(i);
       }
       return arr;
    }
}
