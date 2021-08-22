
public class myStack {
	//stacks are a basic data structure that stores values
	//stores it in a specific order - last in first out
	
	//encapsulation
	private int [] values;
	private int height; //num of ints stored inside stack
	
	
	//need a constructor method
	public myStack() {
		this.values = new int[10];
		this.height = 0; 
	}
	//can have multiple constructors
	public myStack(int maxHeight) {
		this.values = new int[maxHeight];
		this.height = 0; 
	}
	
	public void push(int n) {
		//TODO
		//store int n on stack
		values[height] = n;
		height++;
		
	}
	
	public int pop() {
		
		height--;
		return values[height];
		
	}
	
	public boolean isEmpty() {
		return height == 0;
	}
	
	
	public int getHeight() {
		return height;
	}
	
	public int peek() {
		return values[height-1];
		
	}
	
}
