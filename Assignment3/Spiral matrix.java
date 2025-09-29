class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(top<=bottom && left<=right){
        int i=left;
        while(i<=right){
            list.add(matrix[top][i]);
            i++;
        }
        top++;
        int j=top;
        while(j<=bottom){
            list.add(matrix[j][right]);
            j++;
        }
        right--;
        if(top<=bottom){
            i=right;
        while(i>=left){
            list.add(matrix[bottom][i]);
            i--;
        }
        bottom--;
      }
        if(left<=right){
            j=bottom;
        while(j>=top){
            list.add(matrix[j][left]);
            j--;
        }
        left++;
      }
    }
        return list;
    }
}