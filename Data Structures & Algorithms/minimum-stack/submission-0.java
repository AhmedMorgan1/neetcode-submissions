class MinStack {
    Stack<Integer> min;
    Stack<Integer> stack;
    public MinStack() {
        min  = new Stack<>();
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(!min.isEmpty()){
            if(min.peek() > val){
                min.push(val);
            }
            else{
                min.push(min.peek());
            }
        }
        else{
            min.push(val);
        }
        stack.push(val);    
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
