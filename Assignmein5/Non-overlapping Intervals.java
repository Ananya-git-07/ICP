class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int count=0;
        int prev=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int curr=intervals[i][0];
            if(curr>=prev){
                prev=intervals[i][1];
            }
            else{
                count++;
            }
        }
        return count;
    }
}