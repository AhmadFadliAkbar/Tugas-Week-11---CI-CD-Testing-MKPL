package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count += 3;
	}
	
	public void decrement() {
		count -= 3;
	}
	
	public int getCount() {
		return count;
	}
	
}
