package nightBatch;

public class MethodThisPra1 {
	public void m() {
		System.out.println("Defalult method");
		}
	public void m1(int a) {
		this.m3(1,2,3);
		this.m();
		System.out.println("One paramaeterized method");
		this.m2(1,2);
		this.m4(1,2,3,4);
		}
	public void m2(int a, int b) {
		System.out.println("Two paramaeterized method");
	}
	public void m3(int a, int b,int c) {
		System.out.println("Three paramaeterized method");
	}
	public void m4(int a, int b, int c, int d) {
		System.out.println("Four paramaeterized method");
	}
	
	public static void main(String[] args) {
		MethodThisPra1 o1= new MethodThisPra1();
		o1.m1(1);
		
	}

}
