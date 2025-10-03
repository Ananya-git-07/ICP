class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        helper(list,new ArrayList<>(),n,k,1);
        return list;
    }
    public void helper(List<List<Integer>> list,ArrayList<Integer> curr,int n,int k,int start){
        if(curr.size()==k){
            list.add(new ArrayList<>(curr));
            return;
        }   
        for(int i=start;i<=n;i++){
             curr.add(i);
             helper(list,curr,n,k,i+1);
             curr.remove(curr.size()-1); 
            } 
        }
}