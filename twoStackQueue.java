
public class twoStackQueue {

	private myStack inStack;
	private myStack outStack;
	
	public twoStackQueue() {
		//constructor method
		
		inStack = new myStack();
		outStack= new myStack();
	}
	
	public void add(int value) {
		//add to inStack
		inStack.push(value);
	}
	
	public int remove() {
		//check if there is anything in the outStack
		
		if(outStack.isEmpty()) {
			//move all values to outStack and pop
			while (!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}

			
		return outStack.pop();
	}
	
	public int getLength() {

		return inStack.getHeight() + outStack.getHeight(); 
		
		
	}
	
	public boolean isEmpty() {
		return inStack.isEmpty() && outStack.isEmpty();
	}
}
