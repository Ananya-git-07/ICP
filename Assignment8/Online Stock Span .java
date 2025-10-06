class StockSpanner {
    Stack<Pair> stack;  
    public StockSpanner() {
        stack=new Stack<>();
    }
    class Pair{
        int price;
        int span;
        Pair(int price,int span){
            this.price=price;
            this.span=span;
        }
    }
    public int next(int price) {  
        int span=1;
        while (!stack.isEmpty() && stack.peek().price<=price) {
            span+=stack.pop().span;
        }
        stack.push(new Pair(price,span));
        return span;
    }
}
