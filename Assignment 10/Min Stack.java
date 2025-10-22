class MinStack{
    Stack<Integer> s;
    Stack<Integer> mini;

    public MinStack(){
        s=new Stack<>();
        mini=new Stack<>();
    }

    public void push(int val){
        s.push(val);
        if(mini.isEmpty()){
            mini.push(val);
        } 
        else{
            mini.push(Math.min(val, mini.peek()));
        }
    }

    public void pop(){
        s.pop();
        mini.pop();
    }

    public int top(){
        return s.peek();
    }

    public int getMin(){
        return mini.peek();
    }
}