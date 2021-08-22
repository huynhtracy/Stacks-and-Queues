
public class myGeneralizedStack <T> {
	
		private T[] values; 
		private int height; 
			
		//constructor method
		public myGeneralizedStack() {
			//this.values = new T [10]; //java doesn't allow this
			this.values = (T[]) new Object[10]; 
			this.height = 0; 
		}

		public void push(T t) {
			values[height] = t;
			height++;		
		}
		
		public T pop() {
			height--;
			return values[height];
			
		}
		
		public boolean isEmpty() {
			return height == 0;
		}
		
		
		public int getHeight() {
			return height;
		}
		
		public T peek() {
			return values[height-1];
			
		}
		
		
	}

