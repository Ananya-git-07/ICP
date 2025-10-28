class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            int r[]=new int[m];
            for(int j=i;j<n;j++){
                for(int k=0;k<m;k++){
                    r[k]+=matrix[j][k]-'0';
                }
                int h=j-i+1;
                int sum=0;
                for(int k=0;k<m;k++){
                    if(r[k]==h){
                        sum+=h;
                        max=Math.max(max,sum);
                    }
                    else sum=0;
                }
            }
        }
        return max;
    }
}