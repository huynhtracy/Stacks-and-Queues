
public class myQueue {
	
	private int [] values; 
	
	private int length;
	private int startIndex; 
	private int endIndex; 
	
	public myQueue() {
		values = new int [600];
		length = 0; 
		startIndex = 0;
		endIndex = 0;
	}
	
	public myQueue(int size) {
		values = new int [size];
		length = 0; 
		startIndex = 0;
		endIndex = 0;
	}
	
	public void add (int value) {
		values [endIndex] = value; 
		endIndex++; 
		length++;
	}
	
	public int remove () {
		int value = values[startIndex]; 
		startIndex++;
		length--;
		return value;
		
	}
	
	public boolean isEmpty() {
		return length == 0 ;
	}
	
	public int getLength() {
		return length;
	}
	
	public int peek() {
		return values[startIndex];
	}
	
	
}
