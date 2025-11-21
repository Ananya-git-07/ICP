class MyQueue {
    Stack<Integer>st=new Stack<>();
    Stack<Integer>st1=new Stack<>();
    public MyQueue() {
    }
    public void push(int x) {
        st.push(x);
    }    
    public int pop(){
        while(!st.isEmpty()){
            st1.push(st.pop());
        }
        int v=st1.peek();
        st1.pop();
        while(!st1.isEmpty()){
            st.push(st1.pop());
        }
        return v;
    } 
    public int peek(){
        int k=0;
        for(int i:st){
            k=i;
            break;
        }
        return k;
    }   
    public boolean empty() {
        if(st.isEmpty()){
            return true;
        }
         return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */