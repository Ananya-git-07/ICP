class MyStack{
    private Queue<Integer> q;

    public MyStack(){
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.push(x);
        int size = q.size();
        for (int i=0; i<size-1; i++) {
            q.push(q.poll());
        }
    }

    public int pop(){
        return q.poll();
    }

    public int top(){
        return q.peek();
    }

    public boolean empty(){
        return q.isEmpty();
    }
}
