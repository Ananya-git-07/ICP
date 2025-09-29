class Solution {
    class Pair{
        int a;
        int b;
        Pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->b.a-a.a);
        ArrayList<Integer> list=new ArrayList<>();   
        for(int i=0;i<nums.length;i++){
            q.add(new Pair(nums[i],i));
            while(!q.isEmpty() && !(i-k+1<=q.peek().b && q.peek().b<=i)){
                q.poll();
            }
            if(i>=k-1){
                list.add(q.peek().a);
            }

        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}