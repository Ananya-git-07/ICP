class Solution {
    public int longestOnes(int[] nums, int k) {    
    int l=0;
    int r=0;
    int maxlength=0;
    int count=0;
    while(r<nums.length){
        if (nums[r]==0){
            count++;
        }
        if(count>k){
            if(nums[l]==0) {
                count--;
            }
            l++;
        }
        if(count<=k){
            maxlength=Math.max(maxlength,r-l+1);
        }  
        r++;
    }
    return maxlength;
    }
}
