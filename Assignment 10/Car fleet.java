class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> st=new Stack<>();
        int n=position.length;
        int[][] pair=new int[n][2];
        for(int i=0;i<n;i++){
            pair[i][0]=position[i];                 
            pair[i][1]=speed[i];
        }
        Arrays.sort(pair,(a,b)->Double.compare(a[0],b[0]));
        for(int i=n-1;i>=0;i--){
            int dis=target-pair[i][0];
            int sp=pair[i][1];
            double time=(double)dis/sp;
            if(st.isEmpty() || time>st.peek()){
               st.push(time);
            }
        }
        return st.size();
    }
}