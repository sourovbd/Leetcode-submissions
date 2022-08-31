class MyQueue {
    
   
    public static Stack stack;
    public static Stack stack2;

    public MyQueue() {
        stack = new Stack();
        stack2 = new Stack();
    }

    public void push(int x) {
       stack.push(x);
    }

    public int pop() {

        while (!stack.empty() && !stack2.empty()) {
            List<Integer> popedElementOfStack = new ArrayList<>();
            while(!stack.empty()) {
                popedElementOfStack.add((int)stack.pop());
            }
            while (!stack2.empty()) {
                stack.push(stack2.pop());
            }
            Collections.reverse(popedElementOfStack);
            for (int elememnt : popedElementOfStack) {
                stack.push(elememnt);
            }
            while (!stack.empty()) {
                stack2.push(stack.pop());
            }
        }
        while(!stack.empty()) {
            stack2.push(stack.pop());
        }

        return (int)stack2.pop();
    }

    public int peek() {

        while (!stack.empty() && !stack2.empty()) {
            List<Integer> popedElementOfStack = new ArrayList<>();
            while(!stack.empty()) {
                popedElementOfStack.add((int)stack.pop());
            }
            while (!stack2.empty()) {
                stack.push(stack2.pop());
            }
            Collections.reverse(popedElementOfStack);
            for (int elememnt : popedElementOfStack) {
                stack.push(elememnt);
            }
            while (!stack.empty()) {
                stack2.push(stack.pop());
            }
        }
        while(!stack.empty()) {
            stack2.push(stack.pop());
        }
        return (int)stack2.peek();
    }

    public boolean empty() {
        return stack.empty() && stack2.empty();
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