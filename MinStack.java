import java.util.Stack;
public class Solution {
	Stack<Integer> normal = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
	public void push(int x) {
		normal.push(x);
		if(minStack.empty() || x <= minStack.peek()) 
			minStack.push(x);
	}
	
	public boolean pop() {
		if(normal.empty()) return false;
		if(normal.peek() == minStack.peek()) {
			minStack.pop();
		}
		normal.pop();
		return true;
	}
	
	public boolean getMin(int min) {
		if(minStack.empty()) {
			return false;
		} else {
			min = minStack.pop();
			return true;
		}
	}

}
