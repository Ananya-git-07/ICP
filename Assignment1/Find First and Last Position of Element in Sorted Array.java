class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=bs(nums,target,true);
        int end=bs(nums,target,false);
        return new int[]{first,end};    
    }
    public int bs(int[] nums,int target,boolean foundfirst){
    int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                if(foundfirst){
                    end=mid-1;
                }
                else{
                   start=mid+1;
                }
            }
            else if(nums[mid]>target){
                 end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
       return ans;
    }
}