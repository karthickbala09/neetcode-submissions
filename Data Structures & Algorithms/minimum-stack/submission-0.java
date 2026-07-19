class MinStack {
Stack<Integer> stack;
ArrayList<Integer> list;
    public MinStack() {
        stack = new Stack<>();
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.push(val);
        list.add(val);
    }
    
    public void pop() {
          list.remove(stack.peek());
        stack.pop();
      
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Collections.sort(list);
        return list.get(0);
        
    }
}
