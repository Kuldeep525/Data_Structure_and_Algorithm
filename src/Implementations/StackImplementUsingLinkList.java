package Implementations;

public class StackImplementUsingLinkList<T> {
	
	LinkedList<T> stack  = new LinkedList<T>();
	public static int top = 0;
	
	public void push(T data) {
		stack.add(data);
		top++;
	}
	
	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			stack.deleteAtEnd();
			top--;
		}
	}
	public T peek() {
		if (isEmpty()) {
			T data;
			data = stack.get(top);
			return data;
		}	
		return null;
	}
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		stack.printList();
	}
	
	public String returnStack(){
		return stack.returnList();
	}
	
	 public int size(){
	        return top;
	    }


}
