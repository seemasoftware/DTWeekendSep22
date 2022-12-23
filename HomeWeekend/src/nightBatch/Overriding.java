package nightBatch;

public class Overriding extends Overloading {
	
	public int m1(int a, int b) {
		int c;
		c= a-b;
		System.out.println("Method 1 with output in overloading : result "+c);
		return c;
		}
	public static void main(String[] args) {
		Overriding ob = new Overriding();
		ob.m1();
		ob.m1(1, 2);
	}

}
