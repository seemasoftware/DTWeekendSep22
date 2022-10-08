package nightBatch;

public class Assign2MethodThis {
	public void m() {
		this.m3(1,2,3);
		System.out.println("Defalult method");
		}
	public void m1(int a) {
		this.m();
		System.out.println("One paramaeterized method");
		}
	public void m2(int a, int b) {
		this.m1(1);
		System.out.println("Two paramaeterized method");
	}
	public void m3(int a, int b,int c) {
		System.out.println("Three paramaeterized method");
	}
	public void m4(int a, int b, int c, int d) {
		this.m2(1,2);
		System.out.println("Four paramaeterized method");
	}
	
	public static void main(String[] args) {
		Assign2MethodThis obj = new Assign2MethodThis();
		obj.m4(1,2,3,4);
		}
}
