package nightBatch;



public class Overloading {
	
	public void m1() {
		System.out.println("Method m1");
		}
	
	public void m1(int a) {
		System.out.println("Method m1 with parameter");
		}

	public int m1(int a, int b) {
		int c;
		c= a+b;
		System.out.println("Method 1 with output in overloading : result "+c);
		return c;
		}
public static void main(String[] args) {
	Overloading a= new Overloading();
	a.m1();
	a.m1(1);
	int resultmain =  a.m1(1, 2);
	System.out.println("print result in main: "+ resultmain);
}
}
