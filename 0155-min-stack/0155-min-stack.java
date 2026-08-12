class MinStack {
    private Stack<Integer> minStack;
    private Stack<Integer> mainStack;

    public MinStack() {
        minStack = new Stack<>();
        mainStack = new Stack<>(); 
        
    }
    
    public void push(int value) {
        mainStack.push(value);
        if(minStack.isEmpty()){
            minStack.push(value);
        }else{
            int currMin = Math.min(value, minStack.peek());
            minStack.push(currMin);
        }
               
    }
    
    public void pop() {
        minStack.pop();
        mainStack.pop();
        
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */