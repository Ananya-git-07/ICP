class Solution {
    boolean f=false;
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    found(board,i,j,word, 0);
                    if(f){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    void found(char[][] board,int i,int j,String word,int k){
  if(i<0 || i>=board.length || j<0 || j>=board[0].length || word.charAt(k)!=board[i][j] || board[i][j]=='1'){
            return;
        }
        if(k==word.length()-1){
            f=true;
            return;
        }
        char temp=word.charAt(k);
        int[][] para={{0,1},{0,-1},{1,0},{-1,0}};
        board[i][j]='1';
        for(int m=0;m<para.length;m++){
            found(board,i+para[m][0],j+para[m][1],word,k+1);
        }
        board[i][j]=temp;
    }
}