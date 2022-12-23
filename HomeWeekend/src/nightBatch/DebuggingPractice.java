package nightBatch;

public class DebuggingPractice {
	public void m2() {
		System.out.println("m2 first line");
		System.out.println("m2 second line");
	}
	
	public void m1() {
		System.out.println("m1 first line");
		System.out.println("m1 second line");
	}
	public static void main(String[] args) {
		System.out.println("main method - first line");
		DebuggingPractice d= new DebuggingPractice();
		d.m1();
		System.out.println("main method - second line");
		d.m2();		
		System.out.println("main method - Final line");
	}
}
